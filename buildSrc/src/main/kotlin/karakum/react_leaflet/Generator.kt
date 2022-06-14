package karakum.react_leaflet

import java.io.File

const val GENERATOR_COMMENT = "Automatically generated - do not modify!"

// language=Kotlin
private const val MODULE_DECLARATION = "@file:JsModule(\"react-leaflet\")\n@file:JsNonModule"

fun generateKotlinDeclarations(
    definitionsDir: File,
    typesDir: File,
    sourceDir: File,
) {
    val targetDir = sourceDir.resolve("react/leaflet").apply { mkdirs() }

    targetDir.resolve("aliases.kt")
        .writeText(ALIASES)



}

private operator fun File.div(part: String) = resolve(part)

private fun generate(
    definitionsDir: File,
    targetDir: File,
    suffix: String = ""
) {
    val index = definitionsDir / "index.d.ts"
    val files = definitionsDir.listFiles { file ->
        file != index && file.name.endsWith(".d.ts")
    } ?: return

    val fileMap = files
        .asSequence()
        .map { file ->
            val name = file.name.removeSuffix(".d.ts") + suffix + ".kt"
            val declarations = toDeclarations(file)
            name to declarations
        }
}