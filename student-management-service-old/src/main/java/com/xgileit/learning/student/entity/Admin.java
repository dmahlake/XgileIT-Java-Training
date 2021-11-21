package com.xgileit.learning.student.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    @Column
    private String username;
    @Column
    private String password;
    @OneToMany(targetEntity = Student.class)
    @JoinColumn(name = "adminFk", referencedColumnName = "adminId")
    private List studentList;

    public Admin()
    {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List getStudentList()
    {
        return studentList;
    }

    public void setStudentList(List studendList)
    {
        this.studentList = studendList;
    }


}
