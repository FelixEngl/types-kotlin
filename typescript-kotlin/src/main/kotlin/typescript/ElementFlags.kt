// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package typescript

/**
 * Type references (ObjectFlags.Reference). When a class or interface has type parameters or
 * a "this" type, references to the class or interface are made using type references. The
 * typeArguments property specifies the types to substitute for the type parameters of the
 * class or interface and optionally includes an extra element that specifies the type to
 * substitute for "this" in the resulting instantiation. When no extra argument is present,
 * the type reference itself is substituted for "this". The typeArguments property is undefined
 * if the class or interface has no type parameters and the reference isn't specifying an
 * explicit "this" argument.
 */
// language=JavaScript
@JsName("""(/*union*/{Required: 1, Optional: 2, Rest: 4, Variadic: 8, Fixed: 3, Variable: 12, NonRequired: 14, NonRest: 11}/*union*/)""")
external enum class ElementFlags {
    Required,
    Optional,
    Rest,
    Variadic,
    Fixed,
    Variable,
    NonRequired,
    NonRest,

    ;
}