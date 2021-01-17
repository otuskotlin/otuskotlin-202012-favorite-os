val kotestVersion: String by project

group = "ru.otus"
version = "0.0.1"

plugins {
    val kotlinVersion = "1.4.21"
    kotlin("jvm") version kotlinVersion
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}

repositories {
    mavenCentral()
}
