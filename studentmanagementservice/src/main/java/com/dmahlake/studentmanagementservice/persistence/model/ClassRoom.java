package com.dmahlake.studentmanagementservice.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ClassAttendance")
public class ClassRoom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classId;
    @Column
    private LocalDate todayDate;
    @Column
    private String attendanceStatus;
    @ManyToOne
    @JoinColumn(name = "enrollId")
    private StudentEnroll studentEnroll;

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    @ManyToOne
    @JoinColumn(name = "roleId")
    private UserRoles userRoles;

    public long getClassId() {
        return classId;
    }


    public LocalDate getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(LocalDate todayDate) {
        this.todayDate = todayDate;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public StudentEnroll getStudentEnroll() {
        return studentEnroll;
    }

    public void setStudentEnroll(StudentEnroll studentEnroll) {
        this.studentEnroll = studentEnroll;
    }
}
