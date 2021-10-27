package com.xgileit.learning.student.service.imp;

import com.xgileit.learning.student.entity.ClassRoom;
import com.xgileit.learning.student.repository.ClassRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServices {

    @Autowired
    private ClassRoomRepo classRoomRepo;

    /**
     * Taking attendance register for absent and present student
     * @param studendId
     */
    public void attandenceRegister(int studendId)
    {
        ClassRoom attandence = classRoomRepo.findByStudentId(studendId);
        attandence.setSubject(attandence.getSubject());
        attandence.setClassName(attandence.getClassName());
        attandence.setAttandence(attandence.getAttandence());
        classRoomRepo.save(attandence);


    }


}
