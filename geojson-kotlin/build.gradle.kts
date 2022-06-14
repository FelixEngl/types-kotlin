plugins {
    id("io.github.turansky.kfc.library")
    `geojson-declarations`
}

val kotlinWrappersVersion = property("kotlin-wrappers.version") as String
val geojsonVersion = property("geojson.version") as String

dependencies {
    implementation(npm("@types/geojson", geojsonVersion))

//    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-browser")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-core")
}
