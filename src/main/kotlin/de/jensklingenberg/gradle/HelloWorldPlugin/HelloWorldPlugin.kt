package de.jensklingenberg.gradle.HelloWorldPlugin

import org.gradle.api.Plugin
import org.gradle.api.Project

open class HelloWorldPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create<HelloWorldTask>("helloWorldDo", HelloWorldTask::class.java)
    }
}
