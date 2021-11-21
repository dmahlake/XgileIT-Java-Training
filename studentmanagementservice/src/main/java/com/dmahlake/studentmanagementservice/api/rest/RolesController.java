package com.dmahlake.studentmanagementservice.api.rest;

import com.dmahlake.studentmanagementservice.api.service.RoleService;
import com.dmahlake.studentmanagementservice.persistence.model.UserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Roles/")
public class RolesController {

    @Autowired
    private RoleService roleService;

    @PostMapping("addRoles")
    public UserRoles addRoles(@RequestBody UserRoles userRoles)
    {
       return roleService.addRoles(userRoles);
    }
}
