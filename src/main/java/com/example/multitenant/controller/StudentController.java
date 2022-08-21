package com.example.multitenant.controller;

import com.example.multitenant.dto.StudentReq;
import com.example.multitenant.molel.Student;
import com.example.multitenant.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public ResponseEntity<Student> saveStudent(@RequestBody StudentReq req){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.saveStudent(req));
    }
}
