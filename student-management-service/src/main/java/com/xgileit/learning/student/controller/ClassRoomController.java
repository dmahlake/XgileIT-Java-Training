package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.service.imp.TeacherServices;
import org.springframework.web.bind.annotation.PostMapping;

public class ClassRoomController {

    private TeacherServices teacherServices;

    @PostMapping("/attandenceRegister")
    public void register(int id)
    {
        teacherServices.attandenceRegister(id);
    }
}
