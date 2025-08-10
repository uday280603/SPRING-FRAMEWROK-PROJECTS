package com.example.To_Do.Tracker.service;

import com.example.To_Do.Tracker.entity.Task;
import com.example.To_Do.Tracker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Create / Save Task
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    // Get all tasks
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    // Get task by ID
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    // Update task
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    // Delete task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}