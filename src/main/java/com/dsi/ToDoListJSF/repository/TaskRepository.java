package com.dsi.ToDoListJSF.repository;

import com.dsi.ToDoListJSF.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
