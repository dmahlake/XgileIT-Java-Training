package com.dmahlake.studentmanagementservice.persistence.repo;

import com.dmahlake.studentmanagementservice.persistence.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
