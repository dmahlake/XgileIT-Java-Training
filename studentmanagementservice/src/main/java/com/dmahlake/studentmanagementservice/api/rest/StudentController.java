package com.dmahlake.studentmanagementservice.api.rest;

import com.dmahlake.studentmanagementservice.api.service.StudentService;
import com.dmahlake.studentmanagementservice.persistence.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable long id)
    {
        studentService.deRegister(id);
        return "Successfully deleted";
    }

    @PutMapping("update/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable long id)
    {
        studentService.updateStudent(student, id);
        return "Successfully updated";
    }
}
