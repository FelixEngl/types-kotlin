plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = rootProject.buildDir
            .resolve("js/node_modules/@types/geojson/index.d.ts")
        val sourceDir = projectDir.resolve("src/main/kotlin")

        delete(sourceDir)

        karakum.geojson.generate(
            definitionsFile = definitionsFile,
            sourceDir = sourceDir,
        )
    }
}
