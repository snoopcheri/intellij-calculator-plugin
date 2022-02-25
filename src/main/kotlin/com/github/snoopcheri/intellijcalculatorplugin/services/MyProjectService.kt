package com.github.snoopcheri.intellijcalculatorplugin.services

import com.intellij.openapi.project.Project
import com.github.snoopcheri.intellijcalculatorplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
