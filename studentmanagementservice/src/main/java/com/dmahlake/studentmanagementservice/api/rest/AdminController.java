package com.dmahlake.studentmanagementservice.api.rest;

import com.dmahlake.studentmanagementservice.api.service.AdministratorServ;
import com.dmahlake.studentmanagementservice.api.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Admin/")
public class AdminController {

    @Autowired
    private AdministratorServ service;

    @Autowired
    private RoleService roleService;

    @PostMapping("enroll/{studentId}/{courseId}/{name}")
    public Object enrollStudent(@PathVariable String name, @PathVariable long studentId, @PathVariable long courseId)
    {
       return service.adminEnrollStudent(studentId, courseId, name);
    }

    @PutMapping("updateEnrollment")
    public String updateEnrollment(@PathVariable String name, @PathVariable long studentId, @PathVariable long courseId)
    {
        service.UpdateEnrollStudent(studentId, courseId, name);
        return "Successfully updated";
    }
}
