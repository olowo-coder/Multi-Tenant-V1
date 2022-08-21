package com.example.multitenant.service.serviceImpl;

import com.example.multitenant.dto.StudentReq;
import com.example.multitenant.molel.Student;
import com.example.multitenant.repository.StudentRepository;
import com.example.multitenant.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> fetchAll(){
        return studentRepository.findAll();
    }

    public Student saveStudent(StudentReq request){
        Student student = new Student();
        student.setName(request.getName());
        student.setTenantId(request.getTenantId());
        return studentRepository.save(student);
    }
}
