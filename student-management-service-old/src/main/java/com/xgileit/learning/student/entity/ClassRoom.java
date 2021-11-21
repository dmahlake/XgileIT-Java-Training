package com.xgileit.learning.student.entity;

import javax.persistence.*;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classId;
    @Column
    private String className;
    @Column
    private String  subject;
    @Column
    private String attandence;

    public ClassRoom()
    {

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAttandence() {
        return attandence;
    }

    public void setAttandence(String attandence) {
        this.attandence = attandence;
    }
}
