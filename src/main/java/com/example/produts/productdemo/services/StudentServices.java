package com.example.produts.productdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.produts.productdemo.student.Student;
@Service
public class StudentServices {


    public List<Student> students = List.of(
            new Student(1L, "John Doe", 20, null, "johndoe@gmail.com"),
            new Student(2L, "Jane Smith", 22, null, "janes"),
            new Student(3L, "Alice Johnson", 19, null, "")
        );

     public List<Student> getStudents() {
        return students;
    } 
    
}
