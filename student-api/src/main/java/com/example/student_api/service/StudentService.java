package com.example.student_api.service;

import com.example.student_api.entity.Student;
import com.example.student_api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;

    }
    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Optional<Student> getById(Long id){
        return studentRepository.findById(id);
    }
    public  void delete(Long id){
        studentRepository.deleteById(id);
    }

    public Student update(Long id, Student updateStudent){


        Student student = studentRepository.findById(id).orElseThrow();
        student.setName(updateStudent.getName());
        student.setEmail(updateStudent.getEmail());
        return studentRepository.save(student);

    }


}
