package com.flightapp.flightserver.controller;

import com.flightapp.flightserver.model.Task;
import com.flightapp.flightserver.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    TaskService taskService;
    @GetMapping("/")
    public String helloWorld(){
        return "Hello from Spring boot";
    }
    @PostMapping("/add-task")
    public String addTask(@RequestBody String taskName){
     return taskService.addTask(taskName);

    }
    @GetMapping("/fetch-task")
    public List<Task> fetchTask(){
        return taskService.fetchTasks();
    }

    @DeleteMapping("/delete-tasks")
    public void deleteTask(@RequestBody String taskName){
        taskService.deleteTask(taskName);
    }
}

