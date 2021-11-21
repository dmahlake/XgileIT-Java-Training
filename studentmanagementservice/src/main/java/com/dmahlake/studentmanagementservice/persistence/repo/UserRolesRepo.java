package com.dmahlake.studentmanagementservice.persistence.repo;

import com.dmahlake.studentmanagementservice.persistence.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRolesRepo extends JpaRepository<UserRoles, Long> {

   Optional<UserRoles> findByRoleName(String name);
}
