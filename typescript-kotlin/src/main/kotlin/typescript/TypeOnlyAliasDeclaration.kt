// Automatically generated - do not modify!

package typescript

/**
 * One of:
 * - import x = require("mod");
 * - import x = M.x;
 */
typealias TypeOnlyAliasDeclaration = Any /* ImportClause & {
    readonly isTypeOnly: true;
    readonly name: Identifier;
} | ImportEqualsDeclaration & {
    readonly isTypeOnly: true;
} | NamespaceImport & {
    readonly parent: ImportClause & {
        readonly isTypeOnly: true;
    };
} | ImportSpecifier & {
    readonly parent: NamedImports & {
        readonly parent: ImportClause & {
            readonly isTypeOnly: true;
        };
    };
} | ExportSpecifier & {
    readonly parent: NamedExports & {
        readonly parent: ExportDeclaration & {
            readonly isTypeOnly: true;
        };
    };
} */