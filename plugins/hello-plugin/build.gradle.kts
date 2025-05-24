plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("helloPlugin") {
            id = "com.kacpermartela.hello-plugin"
            implementationClass = "com.kacpermartela.build.HelloWorldPlugin"
        }
    }
}

group = "com.kacpermartela"
version = "1.0.0"
