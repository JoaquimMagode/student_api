package com.example.produts.productdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produts.productdemo.student.Student;
import com.example.produts.productdemo.services.StudentServices;
@RestController
public class StudentController {

    @Autowired
    private final StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }
    
    @GetMapping("/api/v1/students")
    public List<Student> getStudents() {
        return studentServices.getStudents();
    }
}
