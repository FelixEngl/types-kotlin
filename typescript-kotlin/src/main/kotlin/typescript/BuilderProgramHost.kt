// Automatically generated - do not modify!

package typescript

external interface BuilderProgramHost {
    /*
    /**
     * return true if file names are treated with case sensitivity
     */
    useCaseSensitiveFileNames(): boolean;
    /**
     * If provided this would be used this hash instead of actual file shape text for detecting changes
     */
    createHash?: (data: string) => string;
    /**
     * When emit or emitNextAffectedFile are called without writeFile,
     * this callback if present would be used to write files
     */
    writeFile?: WriteFileCallback;
    */
}