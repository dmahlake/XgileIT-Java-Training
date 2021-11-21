package com.xgileit.learning.student.repository;

import com.xgileit.learning.student.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepo extends JpaRepository<ClassRoom, Integer> {

    ClassRoom findByStudentId(int id);
}
