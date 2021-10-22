package com.xgileit.learning.student.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
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
    private List studendList;

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

    public List getStudendList()
    {
        return studendList;
    }

    public void setStudendList(List studendList)
    {
        this.studendList = studendList;
    }


}
