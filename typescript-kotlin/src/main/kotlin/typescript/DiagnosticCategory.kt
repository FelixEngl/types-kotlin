// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package typescript

/**
 * A linked list of formatted diagnostic messages to be used as part of a multiline message.
 * It is built from the bottom up, leaving the head to be the "main" diagnostic.
 * While it seems that DiagnosticMessageChain is structurally similar to DiagnosticMessage,
 * the difference is that messages are all preformatted in DMC.
 */
// language=JavaScript
@JsName("""(/*union*/{Warning: 0, Error: 1, Suggestion: 2, Message: 3}/*union*/)""")
external enum class DiagnosticCategory {
    Warning,
    Error,
    Suggestion,
    Message,

    ;
}