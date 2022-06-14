rootProject.name = "types-kotlin"

pluginManagement {
    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        kotlin("js") version kotlinVersion

        val kfcVersion = extra["kfc.version"] as String
        id("io.github.turansky.kfc.library") version kfcVersion
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("karakum")

include("browser-kotlin")
include("cesium-kotlin")
include("cesium-kotlin-nm")
include("csstype-kotlin")
include("node-kotlin")
include("popper-kotlin")
include("react-kotlin")
include("react-query-kotlin")
include("react-router-dom-kotlin")
include("typescript-kotlin")
include("webrtc-kotlin")
include("react-leaflet-kotlin")
include("leaflet-kotlin")
include("geojson-kotlin")
