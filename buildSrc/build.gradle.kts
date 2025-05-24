plugins {
    `kotlin-dsl`
    id("com.kacpermartela.hello-plugin")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    // Import the hello-plugin from the included build so that it can be used in the conventions plugins
    implementation("com.kacpermartela:hello-plugin")
}
