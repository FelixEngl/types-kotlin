plugins {
    id("io.github.turansky.kfc.library")
    `leaflet-declarations`
}

val kotlinWrappersVersion = property("kotlin-wrappers.version") as String
val leafletVersion = property("leaflet.version") as String

dependencies {
    implementation(npm("@types/leaflet", leafletVersion))

//    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-browser")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-core")
}
