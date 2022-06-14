package karakum.react_leaflet

internal const val DYNAMIC = "dynamic"
internal const val UNIT = "Unit"

internal const val STRING = "String"

internal const val INT = "Int"
internal const val DOUBLE = "Double"

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any",
    "object" to "Any",

    "boolean" to "Boolean",
    "string" to STRING,
    "number" to DOUBLE,

    "void" to UNIT,
    "null" to "Nothing?",
)

internal val SYNTHETIC_TYPE_MAP = mapOf<String, String>(

)

internal val TO_DYNAMIC_TYPE_SET = setOf<String>(

)

internal fun kotlinType(
    type: String,
    name: String,
): String {
    STANDARD_TYPE_MAP[type]
        ?.also { return it }

    SYNTHETIC_TYPE_MAP[type]
        ?.also { return it }

    if (type in TO_DYNAMIC_TYPE_SET){
        return "${DYNAMIC} /* $type */"
    }

    return type
}
