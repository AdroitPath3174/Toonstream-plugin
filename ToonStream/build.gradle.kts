import com.lagradost.cloudstream3.plugins.CloudstreamExtension

plugins {
    id("com.android.library")
    kotlin("android")
    id("com.lagradost.cloudstream3.plugins")
}

cloudstream {
    name = "ToonStream"
    description = "ToonStream extension for Cloudstream"
    version = 1
    authors = listOf("Sunil Kumar")
    lang = "hi"
    type = CloudstreamExtension.Types.Provider
}

android {
    namespace = "com.toonstream"
    compileSdk = 33 

    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.recloudstream:cloudstream:master-SNAPSHOT")
}
