rootProject.name = "favorites_otus"

include("favorites-be-common")
include("favorites-multiplatform-common")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("multiplatform") version kotlinVersion
        kotlin("jvm") version kotlinVersion
    }
}