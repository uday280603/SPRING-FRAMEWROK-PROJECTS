package com.example.employee_management.service;

import com.example.employee_management.entity.Employee;
import com.example.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee emp){
        return repository.save(emp);
    }

    public List<Employee> getAllEmployee(){
        return repository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return repository.findById(id).orElse(null);
    }
    public Employee updateEmployee(Employee emp){
        return repository.save(emp);
    }
    public  void deteletEmployee(Long id){
        repository.deleteById(id);
    }



}
