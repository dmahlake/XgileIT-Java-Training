package com.xgileit.learning.student.controller;


import com.xgileit.learning.student.service.imp.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private StudentService studentService;

   @GetMapping
    public String selectStudent()
    {
        return "Dipuo mahlake selected";
    }

    @PostMapping
    public String createStudent()
    {
        return "Post Method returned";
    }
    @PutMapping
    public String updateStudent()
    {
        return "Student info updated";
    }

    @DeleteMapping
    public  String deleteStudent() {
        return "Student deleted";
    }

    @DeleteMapping("/dropOut")
    public void deregister(@PathVariable("studendId") int studentId)
    {
        studentService.deregisterCourse(studentId);
    }

}
