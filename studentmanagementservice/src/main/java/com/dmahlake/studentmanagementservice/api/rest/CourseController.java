package com.dmahlake.studentmanagementservice.api.rest;


import com.dmahlake.studentmanagementservice.api.service.CourseService;
import com.dmahlake.studentmanagementservice.persistence.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Course/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("addingCourse")
    public Course addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }

}
