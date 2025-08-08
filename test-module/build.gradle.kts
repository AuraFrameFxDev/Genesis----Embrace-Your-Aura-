// Simple test module to verify Kotlin JVM setup
plugins {
    alias(libs.plugins.kotlin.jvm)
}

kotlin {
    jvmToolchain(libs.versions.java.toolchain.get().toInt())
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}