package com.xgileit.learning.student.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @OneToMany(targetEntity = ClassRoom.class)
    @JoinColumn(name = "teacher_Fk", referencedColumnName = "teacherId")
    private List studentList;



    public Teacher()
    {
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
