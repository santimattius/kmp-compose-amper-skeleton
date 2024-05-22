pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven("https://www.jetbrains.com/intellij-repository/releases")
        maven("https://maven.pkg.jetbrains.space/public/p/amper/amper")
        maven("https://packages.jetbrains.team/maven/p/ij/intellij-dependencies")
    }
}

plugins {
    id("org.jetbrains.amper.settings.plugin").version("0.3.0")
}
