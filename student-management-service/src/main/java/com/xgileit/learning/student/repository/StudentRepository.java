package com.xgileit.learning.student.repository;

import com.xgileit.learning.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByStudentId(int id);
}
