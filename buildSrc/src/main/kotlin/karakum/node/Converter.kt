package karakum.node

private val IGNORE_LIST = setOf(
    "BufferConstructor",

    "BigIntOptions",
    "BigIntStats",
    "FSWatcher",
    "StatSyncFn",
    "StatWatcher",
    "WatchOptions",
)

internal data class ConversionResult(
    val name: String,
    val body: String,
)

internal fun convertDefinitions(
    source: String,
    pkg: Package,
): Sequence<ConversionResult> {
    var content = source
        .substringAfter("declare module '${pkg.name}' {\n")
        .substringBefore("\n}")
        .trimIndent()

    val namespaceStart = "\nnamespace ${pkg.name} {\n"
    if (namespaceStart in content) {
        content = content
            .substringAfter(namespaceStart)
            .substringBefore("\n}")
            .trimIndent()
            .let { "\n$it" }
    }

    val globalsStart = "\nglobal {\n"
    if (globalsStart in content) {
        content += "\n\n" + content
            .substringAfter(globalsStart)
            .substringBefore("\n}")
            .trimIndent()
            .let { "\n$it" }
    }

    val interfaces = content
        .splitToSequence("\nexport interface ", "\ninterface ")
        .drop(1)
        .map { convertInterface(it) }
        .filter { it.name !in IGNORE_LIST }

    return when (pkg) {
        Package("buffer") -> interfaces
            .plus(BufferEncoding())

        Package("fs") -> interfaces
            .plus(ConversionResult("Mode", "typealias Mode = Int"))
            .plus(ConversionResult("ReadPosition", "typealias ReadPosition = Number"))

        else -> interfaces
    }
}

private fun convertInterface(
    source: String,
): ConversionResult {
    val name = source.substringBefore(" ")
        .substringBefore("<")
        .substringBefore("(")
        .substringBefore(":")

    val declaration = source
        .substringBefore(" {}\n")
        .substringBefore(" {\n")
        .replace(" extends ", " : ")
        .replace("<number>", "<Number>")

    val bodySource = if (!source.substringBefore("\n").endsWith("{}")) {
        source.substringAfter(" {\n")
            .let { if (it.startsWith("}")) "" else it }
            .substringBefore("\n}")
            .trimIndent()
            .replace("toJSON(): {\n    type: 'Buffer';\n    data: number[];\n};", "toJSON(): any;")
            .replace(";\n *", ";--\n *")
    } else ""

    val body = convertMembers(bodySource)
        .replace(";--\n *", ";\n *")

    return ConversionResult(
        name = name,
        body = "external sealed interface $declaration {\n$body\n}",
    )
}
