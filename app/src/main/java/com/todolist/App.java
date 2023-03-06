
package com.todolist;

import com.todolist.controller.ProjectController;
import com.todolist.model.Project;

import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto Teste");
        project.setDescription("Descricao teste");
        projectController.save(project);
        
        project.setName("Novo nome Projeto");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos: " + projects.size());
    }
}
