rootProject.name = "build-logic"

pluginManagement {
    // Allows plugins from `plugins` included build to be used in build-logic/build.gradle.kts
    includeBuild("../plugins")
}

// Allows plugins from `plugins` included build to be used in convention plugins in build-logic/src/main/kotlin/**.
// Plugins have to be added as a dependency in the dependencies block in build-logic/build.gradle.kts
includeBuild("../plugins")
