package com.dmahlake.studentmanagementservice.api.service;

import com.dmahlake.studentmanagementservice.persistence.model.Course;
import com.dmahlake.studentmanagementservice.persistence.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService { @Autowired
private CourseRepo courseRepo;

    public Course addCourse(Course request)
    {
        Course course = new Course();
        course.setCourseName(request.getCourseName());
        course.setCourseDesc(request.getCourseDesc());
        return courseRepo.save(course);
    }
}



