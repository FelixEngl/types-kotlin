// Automatically generated - do not modify!

package typescript

/**
 * The builder that caches the semantic diagnostics for the program and handles the changed files and affected files
 */
external interface SemanticDiagnosticsBuilderProgram : BuilderProgram {
    /*
    /**
     * Gets the semantic diagnostics from the program for the next affected file and caches it
     * Returns undefined if the iteration is complete
     */
    getSemanticDiagnosticsOfNextAffectedFile(cancellationToken?: CancellationToken, ignoreSourceFile?: (sourceFile: SourceFile) => boolean): AffectedFileResult<readonly Diagnostic[]>;
    */
}