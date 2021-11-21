package com.dmahlake.studentmanagementservice.persistence.repo;

import com.dmahlake.studentmanagementservice.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
