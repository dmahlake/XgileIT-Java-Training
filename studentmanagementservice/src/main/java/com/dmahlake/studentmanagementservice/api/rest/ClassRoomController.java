package com.dmahlake.studentmanagementservice.api.rest;

import com.dmahlake.studentmanagementservice.api.service.ClassRoomService;
import com.dmahlake.studentmanagementservice.persistence.model.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ClassRoom/")
public class ClassRoomController {

    @Autowired
    private ClassRoomService classRoomService;

    @PostMapping("attendance/{id}/{name}")
    public ClassRoom attendanceRegister(@RequestBody ClassRoom classRoom, @PathVariable long id, @PathVariable String name)
    {
        return classRoomService.attendance(classRoom, id, name);
    }
}
