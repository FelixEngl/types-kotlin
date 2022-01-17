// Automatically generated - do not modify!

package typescript

/**
 * A set of one or more available refactoring actions, grouped under a parent refactoring.
 */
external interface ApplicableRefactorInfo {
    /*
    /**
     * The programmatic name of the refactoring
     */
    name: string;
    /**
     * A description of this refactoring category to show to the user.
     * If the refactoring gets inlined (see below), this text will not be visible.
     */
    description: string;
    /**
     * Inlineable refactorings can have their actions hoisted out to the top level
     * of a context menu. Non-inlineanable refactorings should always be shown inside
     * their parent grouping.
     *
     * If not specified, this value is assumed to be 'true'
     */
    inlineable?: boolean;
    actions: RefactorActionInfo[];
    */
}