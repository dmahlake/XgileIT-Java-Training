package com.dmahlake.studentmanagementservice.persistence.repo;

import com.dmahlake.studentmanagementservice.persistence.model.StudentEnroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEnrollRepo extends JpaRepository<StudentEnroll, Long> {


}
