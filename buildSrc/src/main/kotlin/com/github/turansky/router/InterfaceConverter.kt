package com.github.turansky.router

private val CONVERTABLE = setOf(
    "Blocker",
    "Listener",

    "Path",
    "Location",
    "Transition",
    "Update",

    "PathMatch",
    "PathPattern",
    "RouteMatch",
)

private val CLASS_NAME = """
    className?: string | ((props: {
        isActive: boolean;
    }) => string);
""".removeSuffix("\n")

private val STYLE = """
    style?: React.CSSProperties | ((props: {
        isActive: boolean;
    }) => React.CSSProperties);
""".removeSuffix("\n")

internal fun convertInterface(
    name: String,
    source: String,
): String {
    when {
        name in CONVERTABLE -> Unit
        name.endsWith("Object") -> Unit
        name.endsWith("Options") -> Unit
        name.endsWith("Props") -> Unit
        name.endsWith("History") -> Unit
        else -> return source
    }

    var declaration = source.substringBefore(" {")
        .replace("interface ", "external interface ")
        .replace(" extends ", " : ")
        .replace(
            "Omit<React.AnchorHTMLAttributes<HTMLAnchorElement>, \"href\">",
            "react.dom.html.AnchorHTMLAttributes<org.w3c.dom.HTMLAnchorElement>",
        )
        .replace(
            "Omit<LinkProps, \"className\" | \"style\">",
            "LinkProps",
        )

    if (name == "OutletProps")
        declaration += ": react.Props"

    val membersSource = source
        .replace(CLASS_NAME, "")
        .replace(STYLE, "")
        .substringAfter(" {\n")
        .also { if (it == "}") return declaration }
        .substringBefore(";\n}")
        .trimIndent()

    if (membersSource.startsWith("("))
        return "typealias $name = ${membersSource.replace("): void", ") -> Unit")}"

    var members = membersSource
        .splitToSequence(";\n")
        .joinToString("\n", transform = ::convertMember)

    if (name.endsWith("Props") && ":" !in declaration) {
        val parentType = if ("var children: react.ReactNode?" in members) {
            members = members.replace(
                "var children: react.ReactNode?",
                "override var children: kotlinext.js.ReadonlyArray<react.ReactNode>?",
            )
            "react.PropsWithChildren"
        } else {
            "react.Props"
        }

        declaration += " : $parentType"
    }

    return "$declaration {\n$members\n}"
}

private fun convertMember(
    source: String,
): String {
    val comment = source.substringBeforeLast("\n", "")
    val body = source.substringAfterLast("\n")

    val declaration = if ("(" in body) {
        convertMethod(body)
    } else {
        convertParameter(body)
    }

    return sequenceOf(comment, declaration)
        .filter { it.isNotEmpty() }
        .joinToString("\n")
}

private fun convertMethod(
    source: String,
): String {
    return "fun " + source
        .replace("): () => void", "): () -> Unit")
        .replace("): void", ")")
        .replace("): string", "): String")
        .replace("delta: number", "delta: Int")
        .replace(", state?: any", ", state: Any = definedExternally")
}

private fun convertParameter(
    source: String,
): String {
    val name = source
        .substringBefore("?: ")
        .substringBefore(": ")
        .removePrefix("readonly ")

    var type = kotlinType(source.substringAfter(": "), name)
    if ("?: " in source && !type.endsWith("?"))
        type += "?"

    val modifier = if (source.startsWith("readonly ")) "val" else "var"
    return "$modifier $name: $type"
}
