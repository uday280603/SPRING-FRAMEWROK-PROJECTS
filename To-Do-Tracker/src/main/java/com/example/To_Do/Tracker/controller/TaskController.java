package com.example.To_Do.Tracker.controller;

import com.example.To_Do.Tracker.entity.Task;
import com.example.To_Do.Tracker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return  service.saveTask(task);

    }
    @GetMapping
    public List<Task> getAllTask(){
        return  service.getAllTask();

    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return service.getTaskById(id);
    }

    @PutMapping
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);

    }
    @DeleteMapping("/{id}")
    public  void deteletTask(@PathVariable Long id){
        service.deleteTask(id);
    }




}
