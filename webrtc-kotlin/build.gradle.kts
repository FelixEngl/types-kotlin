plugins {
    id("io.github.turansky.kfc.library")
    `webrtc-declarations`
}

val webrtcTypesVersion = property("webrtc-types.version") as String
val kotlinWrappersVersion = property("kotlin-wrappers.version") as String

dependencies {
    implementation(npm("@types/webrtc", webrtcTypesVersion))

    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-extensions")
}
