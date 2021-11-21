package com.dmahlake.studentmanagementservice.api.service;

import com.dmahlake.studentmanagementservice.persistence.model.ClassRoom;
import com.dmahlake.studentmanagementservice.persistence.model.StudentEnroll;
import com.dmahlake.studentmanagementservice.persistence.model.UserRoles;
import com.dmahlake.studentmanagementservice.persistence.repo.ClassRoomRepo;
import com.dmahlake.studentmanagementservice.persistence.repo.StudentEnrollRepo;
import com.dmahlake.studentmanagementservice.persistence.repo.UserRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ClassRoomService {

    @Autowired
    private StudentEnrollRepo studentEnrollRepo;
    @Autowired
    private UserRolesRepo userRolesRepo;
    @Autowired
    private ClassRoomRepo repo;

    public ClassRoom attendance(ClassRoom request, long enrollId, String name)
    {
        StudentEnroll studentEnroll = studentEnrollRepo.findById(enrollId).get();
        UserRoles userRoles = userRolesRepo.findByRoleName(name).get();
        ClassRoom classRoom = new ClassRoom();
        if (userRoles.getRoleName().equals("TEACHER"))
        {
            classRoom.setTodayDate(LocalDate.now());
            classRoom.setAttendanceStatus(request.getAttendanceStatus());
            classRoom.setStudentEnroll(studentEnroll);
            classRoom.setUserRoles(userRoles);
        }
        else
        {
            throw new RuntimeException("Only Teacher can take register");
        }

        return repo.save(classRoom);

    }
}
