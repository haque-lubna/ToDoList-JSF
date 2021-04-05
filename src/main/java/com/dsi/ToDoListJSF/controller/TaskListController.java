package com.dsi.ToDoListJSF.controller;

import com.dsi.ToDoListJSF.entity.Task;
import com.dsi.ToDoListJSF.repository.TaskRepository;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope(value = "session")
@Component(value = "taskList")
@ELBeanName(value = "taskList")
@Join(path = "/", to = "/task-list.jsf")
public class TaskListController {
    @Autowired
    private TaskRepository taskRepository;
    private List<Task> tasks;

    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData(){
        tasks = taskRepository.findAll();
    }
    public List<Task> getTasks(){
        return tasks;
    }
}
