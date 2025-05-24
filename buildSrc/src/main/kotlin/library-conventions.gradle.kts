plugins {
    java
    `java-library`
    id("com.kacpermartela.hello-plugin")
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
