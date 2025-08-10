package com.example.student_api.controller;

import com.example.student_api.entity.Student;
import com.example.student_api.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.save(student);

    }
    @GetMapping
    public List<Student> getAll(){
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){
        return service.getById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student){
        return service.update(id, student);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id){
        service.delete(id);
    }










}
