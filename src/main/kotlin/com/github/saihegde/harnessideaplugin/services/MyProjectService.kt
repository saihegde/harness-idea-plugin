package com.github.saihegde.harnessideaplugin.services

import com.intellij.openapi.project.Project
import com.github.saihegde.harnessideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
