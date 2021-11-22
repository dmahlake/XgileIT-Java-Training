package com.dmahlake.studentmanagementservice.api.service;

import com.dmahlake.studentmanagementservice.persistence.model.Student;
import com.dmahlake.studentmanagementservice.persistence.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student request)
    {
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmailAddress(request.getEmailAddress());
        student.setMobileNumber(request.getMobileNumber());
        student.setAddress(request.getAddress());

        return studentRepo.save(student);
    }

    public void deRegister(long id)
    {
        studentRepo.deleteById(id);
    }

    public Student updateStudent(Student request, long studentId)
    {

        Student updateStudent = studentRepo.findById(studentId).get();
        updateStudent.setFirstName(request.getFirstName());
        updateStudent.setLastName(request.getLastName());
        updateStudent.setEmailAddress(request.getEmailAddress());
        updateStudent.setMobileNumber(request.getMobileNumber());
        updateStudent.setAddress(request.getAddress());
        return studentRepo.save(updateStudent);
    }
}
