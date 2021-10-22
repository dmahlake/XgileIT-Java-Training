package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.entity.Admin;
import com.xgileit.learning.student.entity.Student;
import com.xgileit.learning.student.repository.AdminRepository;
import com.xgileit.learning.student.repository.StudentRepository;
import com.xgileit.learning.student.service.imp.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private AdminServices adminServices;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student request)
    {
        adminServices.addStudent(request);
        return "Successfully added";
    }

    public void adminDetails(@RequestBody Admin request)
    {
        adminServices.getAdmin(request);
    }

    @GetMapping("/findAllStudents")
    public List<Student> findAllStudents()
    {
        return adminServices.findAllStudents();
    }

    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@RequestBody Student student, int id)
    {
        adminServices.updateStudent(student, id);
    }

    @DeleteMapping("/student/{studentId}")
    public void deleteStudent(@PathVariable("studendId") int studentId)
    {
        adminServices.deleteStudent(studentId);
    }




}
