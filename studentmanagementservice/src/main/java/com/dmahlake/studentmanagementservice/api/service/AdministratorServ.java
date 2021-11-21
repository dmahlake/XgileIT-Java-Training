package com.dmahlake.studentmanagementservice.api.service;

import com.dmahlake.studentmanagementservice.persistence.model.Course;
import com.dmahlake.studentmanagementservice.persistence.model.Student;
import com.dmahlake.studentmanagementservice.persistence.model.StudentEnroll;
import com.dmahlake.studentmanagementservice.persistence.model.UserRoles;
import com.dmahlake.studentmanagementservice.persistence.repo.CourseRepo;
import com.dmahlake.studentmanagementservice.persistence.repo.StudentEnrollRepo;
import com.dmahlake.studentmanagementservice.persistence.repo.StudentRepo;
import com.dmahlake.studentmanagementservice.persistence.repo.UserRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServ {

    @Autowired
    private StudentEnrollRepo studentEnrollRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private UserRolesRepo userRolesRepo;

    public Object adminEnrollStudent(long studentId, long courseId, String name)
    {

        Student student = studentRepo.findById(studentId).get();
        Course course = courseRepo.findById(courseId).get();

        UserRoles userRoles = userRolesRepo.findByRoleName(name).get();

        StudentEnroll studentEnroll = new StudentEnroll();
        if (userRoles.getRoleName().equals("ADMIN")) {
            studentEnroll.setStudent(student);
            studentEnroll.setCourse(course);
            studentEnroll.setUserRoles(userRoles);
        }
        else
        {
            throw new RuntimeException("Only admin can enroll student");
        }

        return studentEnrollRepo.save(studentEnroll);
    }



}
