package de.jensklingenberg.gradle.HelloWorldPlugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class HelloWorldTask : DefaultTask() {

    @TaskAction
    fun doHelloWorld() {
        println("Hello World!")
    }
}
