// Automatically generated - do not modify!

package typescript

/** Host that has watch functionality used in --watch mode */
external interface WatchHost {
    /*
    /** If provided, called with Diagnostic message that informs about change in watch status */
    onWatchStatusChange?(diagnostic: Diagnostic, newLine: string, options: CompilerOptions, errorCount?: number): void;
    /** Used to watch changes in source files, missing files needed to update the program or config file */
    watchFile(path: string, callback: FileWatcherCallback, pollingInterval?: number, options?: CompilerOptions): FileWatcher;
    /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
    watchDirectory(path: string, callback: DirectoryWatcherCallback, recursive?: boolean, options?: CompilerOptions): FileWatcher;
    /** If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together */
    setTimeout?(callback: (...args: any[]) => void, ms: number, ...args: any[]): any;
    /** If provided, will be used to reset existing delayed compilation */
    clearTimeout?(timeoutId: any): void;
    */
}