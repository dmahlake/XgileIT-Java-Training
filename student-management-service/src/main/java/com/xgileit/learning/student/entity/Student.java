package com.xgileit.learning.student.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private long phoneNumber ;
    @Column
    private String gender;
    @Column
    private int age;
    @OneToMany(targetEntity = ClassRoom.class)
    @JoinColumn(name = "student_Fk", referencedColumnName = "studentId")
    private List studentList;

    /**
     * I did not initialize the studentNumber in this constructor, because i'm going to generate
     * a random studentNumber for each Student Object being created.
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param gender
     * @param age
     */
   public Student(String firstName, String lastName, long phoneNumber, String gender, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }

    public Student()
    {

    }

    public String getFirstName() {
        return firstName;
    }

    public int getStudentId()
    {
        return studentId;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
