// Automatically generated - do not modify!

package typescript

/**
 * Node in a tree of nested declarations in a file.
 * The top node is always a script or module node.
 */
external interface NavigationTree {
    /*
    /** Name of the declaration, or a short description, e.g. "<class>". */
    text: string;
    kind: ScriptElementKind;
    /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
    kindModifiers: string;
    /**
     * Spans of the nodes that generated this declaration.
     * There will be more than one if this is the result of merging.
     */
    spans: TextSpan[];
    nameSpan: TextSpan | undefined;
    /** Present if non-empty */
    childItems?: NavigationTree[];
    */
}