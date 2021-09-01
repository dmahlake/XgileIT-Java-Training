package com.xgileit.learning.student.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/api/v1/student")
public class StudentController {

    ArrayList<String>studentList = new ArrayList<>();

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
    public  String deleteStudent()
    {
        return "Student record deleted";
    }

    @RequestMapping(value= "/fetch/{id}", method= RequestMethod.GET)
    public String studentPath(@PathVariable ("studentId")int studentId)
    {
        if (studentId == 2)
        {
            return  "Student found";
        }
        return "Student not found";
    }

    @RequestMapping(value="/all/{student}", method = RequestMethod.GET)
    public List listOfStudent(@PathVariable("studentId") int studentId, @RequestParam String name)
    {
        if (studentId == 2)
        {
            studentList.add(name);
        }
        return studentList;
    }
}
