package com.kacpermartela.build

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

class HelloWorldPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.logger.quiet("Applying HelloWorldPlugin")

        val helloTask = project.tasks.register<HelloWorldTask>("helloFromPlugin")

        project.tasks.findByName("classes")?.dependsOn(helloTask)
    }
}
