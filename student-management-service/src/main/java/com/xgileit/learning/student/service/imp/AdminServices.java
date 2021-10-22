package com.xgileit.learning.student.service.imp;

import com.xgileit.learning.student.entity.Admin;
import com.xgileit.learning.student.entity.Student;
import com.xgileit.learning.student.repository.AdminRepository;
import com.xgileit.learning.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServices {
    /**
     * Creating student object as class variable i don't want to create
     * a lot of student object. I can add multiple students using this variable
     */

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AdminRepository adminRepository;

    public void addStudent(Student request)
    {
       Student student = new Student();
       student.setFirstName(request.getFirstName());
       student.setLastName(request.getLastName());
       student.setPhoneNumber(request.getPhoneNumber());
       student.setAge(request.getAge());
       student.setGender(request.getGender());
       studentRepository.save(request);
    }

    public void getAdmin(Admin request)
    {
        Admin admin = new Admin();
        admin.setUsername(request.getUsername());
        admin.setPassword(request.getPassword());
        admin.setStudendList(request.getStudendList());
        adminRepository.save(request);
    }

    public List<Student> findAllStudents()
    {
        return studentRepository.findAll();
    }


     public void updateStudent(Student student, int studentId)
     {
        Student studentFind = studentRepository.findByStudentId(studentId);
        studentFind.setLastName(student.getLastName());
        studentFind.setFirstName(student.getFirstName());
        studentFind.setGender(student.getGender());
        studentFind.setAge(student.getAge());
        studentFind.setPhoneNumber(student.getPhoneNumber());
        studentRepository.save(studentFind);
     }

     public void deleteStudent(int studentId)
     {
        Student deleteStudent = studentRepository.findByStudentId(studentId);
        studentRepository.delete(deleteStudent);
     }
}
