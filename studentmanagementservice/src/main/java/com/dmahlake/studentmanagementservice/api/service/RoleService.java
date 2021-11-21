package com.dmahlake.studentmanagementservice.api.service;

import com.dmahlake.studentmanagementservice.persistence.model.UserRoles;
import com.dmahlake.studentmanagementservice.persistence.repo.UserRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private UserRolesRepo userRolesRepo;

    public UserRoles addRoles(UserRoles request)
    {
        UserRoles userRoles = new UserRoles();

        userRoles.setRoleName(request.getRoleName());
        return userRolesRepo.save(userRoles);
    }

    /*public void access(String name)
    {
        Optional<UserRoles> userRoles = Optional.ofNullable(userRolesRepo.findByRoleName(name));
        if (userRoles.isPresent() && !userRoles.get().getRoleName().contains("ADMIN"))
        {
            throw new RuntimeException("Only admin can enroll students");
        }
    }*/
}
