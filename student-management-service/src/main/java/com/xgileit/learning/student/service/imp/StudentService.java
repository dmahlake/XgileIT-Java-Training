package com.xgileit.learning.student.service.imp;

import com.xgileit.learning.student.entity.Student;
import com.xgileit.learning.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void deregisterCourse(int studentId)
    {
        Student student = studentRepository.findByStudentId(studentId);
        if(studentId != student.getStudentId())
            throw new RuntimeException("No such student Exist"+ studentId);
        else
            studentRepository.deleteById(studentId);
    }
}
