package com.dsi.ToDoListJSF.controller;

import com.dsi.ToDoListJSF.entity.Task;
import com.dsi.ToDoListJSF.repository.TaskRepository;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "taskNewController")
@ELBeanName(value = "taskNewController")
@Join(path = "/new", to = "/task-new-form.jsf")
public class TaskNewController {
    @Autowired
    private TaskRepository taskRepository;
    private Task task = new Task();

    public String saveTask(){
        taskRepository.save(task);
        task = new Task();

        return "/task-list.xhtml?faces-redirect=true";
    }

    public Task getTask(){
        return task;
    }
}
