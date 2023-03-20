rootProject.name = "bladder-and-bowel"

pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/") { name = "Fabric" }
        mavenCentral()
        gradlePluginPortal()
    }
}

// Refer to https://fabricmc.net/develop to get the newest versions for minecraft, yarn, fabric-loader and fabric-api
// Refer to https://github.com/FabricMC/fabric-language-kotlin to get the newest version for fabric-language-kotlin
// Refer to https://docs.gradle.org/current/userguide/platforms.html to learn more about Gradle version catalogs
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("minecraft", "1.19.4")
            version("yarn", "1.19.4+build.1")
            version("fabric-loader", "0.14.17")
            version("fabric-api", "0.76.0+1.19.4")
            version("fabric-language-kotlin", "1.9.2+kotlin.1.8.10")

            library("minecraft", "com.mojang", "minecraft").versionRef("minecraft")
            library("yarn", "net.fabricmc", "yarn").versionRef("yarn")
            library("fabric-loader", "net.fabricmc", "fabric-loader").versionRef("fabric-loader")
            library("fabric-api", "net.fabricmc.fabric-api", "fabric-api").versionRef("fabric-api")
            library("fabric-language-kotlin", "net.fabricmc", "fabric-language-kotlin").versionRef("fabric-language-kotlin")
        }
    }
}