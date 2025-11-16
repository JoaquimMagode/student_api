package com.example.produts.productdemo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produts.productdemo.student.Student;
@RestController
public class StudentController {

    private final StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }
    
    @GetMapping("/api/v1/students")
    public List<Student> getStudents() {
        return studentServices.getStudents();
    }
}
