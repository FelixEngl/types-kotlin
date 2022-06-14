package karakum.react_leaflet

abstract class Declaration {
    protected abstract val source: String

    abstract val name: String

    abstract fun toCode(): String
}
