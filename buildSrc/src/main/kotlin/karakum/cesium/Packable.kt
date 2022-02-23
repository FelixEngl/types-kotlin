package karakum.cesium

const val PACKABLE: String = "Packable"
const val PACKED_LENGTH = "packedLength"

val PACKABLE_MEMBERS: Set<String> = setOf(
    PACKED_LENGTH,
    "pack",
    "unpack"
)

fun applyPackableFixes(code: String): String =
    code.replace(": Any", ": T")
        .replace("interface $PACKABLE", "interface $PACKABLE<T: Any>")
        .replaceFirst("definedExternally\n)", "definedExternally\n): Array<out Double>")
        .replace("companion object  {", "")
        .replace("}\n}\n", "}\n")