package com.dmahlake.studentmanagementservice.persistence.repo;

import com.dmahlake.studentmanagementservice.persistence.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepo extends JpaRepository<ClassRoom, Long> {
}
