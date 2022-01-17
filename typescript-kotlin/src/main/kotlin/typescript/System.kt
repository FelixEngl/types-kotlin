// Automatically generated - do not modify!

package typescript

external interface System {
    /*
    args: string[];
    newLine: string;
    useCaseSensitiveFileNames: boolean;
    write(s: string): void;
    writeOutputIsTTY?(): boolean;
    getWidthOfTerminal?(): number;
    readFile(path: string, encoding?: string): string | undefined;
    getFileSize?(path: string): number;
    writeFile(path: string, data: string, writeByteOrderMark?: boolean): void;
    /**
     * @pollingInterval - this parameter is used in polling-based watchers and ignored in watchers that
     * use native OS file watching
     */
    watchFile?(path: string, callback: FileWatcherCallback, pollingInterval?: number, options?: WatchOptions): FileWatcher;
    watchDirectory?(path: string, callback: DirectoryWatcherCallback, recursive?: boolean, options?: WatchOptions): FileWatcher;
    resolvePath(path: string): string;
    fileExists(path: string): boolean;
    directoryExists(path: string): boolean;
    createDirectory(path: string): void;
    getExecutingFilePath(): string;
    getCurrentDirectory(): string;
    getDirectories(path: string): string[];
    readDirectory(path: string, extensions?: readonly string[], exclude?: readonly string[], include?: readonly string[], depth?: number): string[];
    getModifiedTime?(path: string): Date | undefined;
    setModifiedTime?(path: string, time: Date): void;
    deleteFile?(path: string): void;
    /**
     * A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
     */
    createHash?(data: string): string;
    /** This must be cryptographically secure. Only implement this method using `crypto.createHash("sha256")`. */
    createSHA256Hash?(data: string): string;
    getMemoryUsage?(): number;
    exit(exitCode?: number): void;
    realpath?(path: string): string;
    setTimeout?(callback: (...args: any[]) => void, ms: number, ...args: any[]): any;
    clearTimeout?(timeoutId: any): void;
    clearScreen?(): void;
    base64decode?(input: string): string;
    base64encode?(input: string): string;
    */
}