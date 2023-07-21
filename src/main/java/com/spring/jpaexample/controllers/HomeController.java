package com.spring.jpaexample.controllers;

import com.spring.jpaexample.entities.Student;
import com.spring.jpaexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students/display")
    public List<Student> displayStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/add")
    public Student addStudent() {
        Student student = new Student("SUDHEER", "VIZAG");
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }
}
