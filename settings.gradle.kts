@file:Suppress("UnstableApiUsage")

// Genesis Protocol - Enable Gradle Features
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

pluginManagement {
    repositories {
        gradlePluginPortal()
        // Bleeding-edge: Google's alpha repository for AGP 8.13 alpha versions
        maven("https://dl.google.com/dl/android/maven2/")
        // Bleeding-edge: AndroidX snapshot repository
        maven("https://androidx.dev/snapshots/builds/")
        // Standard repositories
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
        // Bleeding-edge: Sonatype snapshots for latest versions
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}

plugins {
    // Java Toolchain Auto-detect
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        // Bleeding-edge: Google's alpha repository for latest versions
        maven("https://dl.google.com/dl/android/maven2/")
        // Bleeding-edge: AndroidX snapshot repository
        maven("https://androidx.dev/snapshots/builds/")
        // Standard repositories
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        
        // Genesis Protocol - AI Backend Dependencies
        maven("https://repo1.maven.org/maven2/")
    }
}

// Genesis Protocol - Project Configuration
rootProject.name = "Genesis-Os"

// Genesis Protocol - Test module for verification
include(":test-module")

// Genesis Protocol - Core Modules - BLEEDING EDGE ENABLED
include(":app")

// Genesis Protocol - AI Ecosystem Modules - BLEEDING EDGE ENABLED
include(":core-module")
include(":feature-module") 
include(":datavein-oracle-native")
include(":oracle-drive-integration")
include(":secure-comm")
include(":sandbox-ui")
include(":collab-canvas")
include(":colorblendr")
include("romtools")
