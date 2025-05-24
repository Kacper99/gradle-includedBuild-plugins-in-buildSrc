package com.kacpermartela.build

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class HelloWorldTask: DefaultTask() {

    @get:Input
    abstract val greeting: Property<String>

    init {
        description = "Prints a greeting."
        group = "custom"
        greeting.convention("Default greeting from the HelloWorld task!")
    }

    @TaskAction
    fun greet() {
        logger.quiet(greeting.get())
    }
}
