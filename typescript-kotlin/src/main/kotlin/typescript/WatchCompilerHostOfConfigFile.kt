// Automatically generated - do not modify!

package typescript

/**
 * Host to create watch with config file
 */
external interface WatchCompilerHostOfConfigFile<T : BuilderProgram> : WatchCompilerHost<T>, ConfigFileDiagnosticsReporter {
    /*
    /** Name of the config file to compile */
    configFileName: string;
    /** Options to extend */
    optionsToExtend?: CompilerOptions;
    watchOptionsToExtend?: WatchOptions;
    extraFileExtensions?: readonly FileExtensionInfo[];
    /**
     * Used to generate source file names from the config file and its include, exclude, files rules
     * and also to cache the directory stucture
     */
    readDirectory(path: string, extensions?: readonly string[], exclude?: readonly string[], include?: readonly string[], depth?: number): string[];
    */
}