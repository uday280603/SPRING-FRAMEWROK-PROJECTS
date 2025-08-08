package com.example.employee_management.controller;


import com.example.employee_management.entity.Employee;
import com.example.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return  service.saveEmployee(employee);

    }
    @GetMapping
    public List<Employee> getAllEmployees(){
        return  service.getAllEmployee();

    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);

    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        service.deteletEmployee(id);
    }




}
