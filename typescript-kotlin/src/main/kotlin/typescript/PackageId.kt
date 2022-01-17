// Automatically generated - do not modify!

package typescript

/**
 * Unique identifier with a package name and version.
 * If changing this, remember to change `packageIdIsEqual`.
 */
external interface PackageId {
    /*
    /**
     * Name of the package.
     * Should not include `@types`.
     * If accessing a non-index file, this should include its name e.g. "foo/bar".
     */
    name: string;
    /**
     * Name of a submodule within this package.
     * May be "".
     */
    subModuleName: string;
    /** Version of the package, e.g. "1.2.3" */
    version: string;
    */
}