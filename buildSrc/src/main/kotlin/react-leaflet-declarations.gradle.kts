plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsDir = rootProject.buildDir
            .resolve("js/node_modules/@react-leaflet/lib")
        val typesDir = rootProject.buildDir
            .resolve("js/node_modules/react-leaflet/lib")
        val sourceDir = projectDir.resolve("src/main/kotlin")

        delete(sourceDir)

        karakum.react_leaflet.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            typesDir = typesDir,
            sourceDir = sourceDir,
        )
    }
}
