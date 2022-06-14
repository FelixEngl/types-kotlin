plugins {
    id("io.github.turansky.kfc.library")
    `leaflet-declarations`
}

val kotlinWrappersVersion = property("kotlin-wrappers.version") as String

dependencies {
    implementation(npmv("leaflet"))

//    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-browser")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-core")
}
