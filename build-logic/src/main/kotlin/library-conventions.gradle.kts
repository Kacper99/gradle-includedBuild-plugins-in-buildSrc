plugins {
    java
    `java-library`
}

repositories {
    mavenCentral()
}

// Having to use the legacy approach for applying plugins
apply<com.kacpermartela.build.HelloWorldPlugin>()

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
