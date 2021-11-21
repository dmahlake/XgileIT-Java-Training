package com.dmahlake.studentmanagementservice.api.rest;

import com.dmahlake.studentmanagementservice.api.service.StudentService;
import com.dmahlake.studentmanagementservice.persistence.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("addStudent")
    public Student addNewStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
}
