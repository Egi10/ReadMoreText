// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(BuildPlugins.application) version Version.gradle apply false
    id(BuildPlugins.library) version Version.gradle apply false
    id(BuildPlugins.kotlin) version Version.kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}