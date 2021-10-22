package com.xgileit.learning.student.repository;

import com.xgileit.learning.student.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
