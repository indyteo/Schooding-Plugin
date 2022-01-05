package com.github.indyteo.schoodingplugin.services

import com.intellij.openapi.project.Project
import com.github.indyteo.schoodingplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
