package com.github.turansky.csstype

internal interface ParentProvider {
    fun get(): String
}

internal interface ParentConsumer {
    fun apply(
        items: List<ConversionResult>,
    ): List<ConversionResult>
}

internal class ParentContext(
    private val type: String,
    private val updateMode: Boolean = false,
) : ParentProvider, ParentConsumer {
    private val marker: String = "// $type\n"

    lateinit var parentTypes: List<String>

    override fun get(): String =
        parentTypes.joinToString(",\n")

    override fun apply(
        items: List<ConversionResult>,
    ): List<ConversionResult> {
        parentTypes = items.asSequence()
            .filter { marker in it.body }
            .map { it.name }
            .sorted()
            .toList()

        return items.map { it.copy(body = it.body.replace(marker, "")) }
    }
}
