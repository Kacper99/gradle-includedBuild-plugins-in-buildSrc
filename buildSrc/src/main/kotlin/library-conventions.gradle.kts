plugins {
    java
    `java-library`
    id("com.kacpermartela.hello-plugin") // Plugin from plugins/hello-plugin can be used here yay!
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
