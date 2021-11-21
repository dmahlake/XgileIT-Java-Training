package com.dmahlake.studentmanagementservice.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Enrollment")
public class StudentEnroll implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long enrollId;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "courseCode")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "roleId")
    private UserRoles userRoles;

    public long getEnrollId() {
        return enrollId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEnrollId(long enrollId) {
        this.enrollId = enrollId;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

}
