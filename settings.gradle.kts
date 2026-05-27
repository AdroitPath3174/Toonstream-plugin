pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.lagradost.cloudstream3.plugins") {
                useModule("com.github.recloudstream:gradle:-SNAPSHOT")
            }
        }
    }
}

rootProject.name = "ToonStreamExtension"
include(":ToonStream")
