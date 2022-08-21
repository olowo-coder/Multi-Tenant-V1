package com.example.multitenant.service;

import com.example.multitenant.dto.StudentReq;
import com.example.multitenant.molel.Student;

import java.util.List;

public interface StudentService {

    List<Student> fetchAll();
    Student saveStudent(StudentReq request);
}
