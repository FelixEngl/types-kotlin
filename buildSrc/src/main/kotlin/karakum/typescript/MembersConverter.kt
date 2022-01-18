package karakum.typescript

internal fun convertMembers(
    source: String,
): String {
    if (source.isEmpty())
        return ""

    if ("(" in source)
        return "    /*\n" + source + "\n    */"

    return source.trimIndent()
        .removeSuffix(";")
        .splitToSequence(";\n")
        .map { convertMember(it) }
        .joinToString("\n")
}

internal fun convertMember(
    source: String,
): String {
    val comment = source.substringBeforeLast("\n", "")
        .ifEmpty { null }

    var body = source.substringAfterLast("\n")
    val modifier = if (body.startsWith("readonly ")) "val" else "var"
    body = body.removePrefix("readonly ")

    val name = body.substringBefore(": ").removeSuffix("?")
    var type = body.substringAfter(": ")
    if (" | " in type)
        type = "Union /* $type */"

    val optional = body.startsWith("${name}?")
    if (optional) {
        type = if (" /*" in type) type.replace(" /*", "? /*") else "$type?"
    }

    return sequenceOf(
        comment,
        "$modifier $name: $type"
    ).filterNotNull()
        .joinToString("\n")
}