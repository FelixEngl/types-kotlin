// Automatically generated - do not modify!

package typescript

/**
 * A linked list of formatted diagnostic messages to be used as part of a multiline message.
 * It is built from the bottom up, leaving the head to be the "main" diagnostic.
 * While it seems that DiagnosticMessageChain is structurally similar to DiagnosticMessage,
 * the difference is that messages are all preformatted in DMC.
 */
external interface ProjectReference {
    /*
    /** A normalized path on disk */
    path: string;
    /** The path as the user originally wrote it */
    originalPath?: string;
    /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
    prepend?: boolean;
    /** True if it is intended that this reference form a circularity */
    circular?: boolean;
    */
}