package com.xgileit.learning.student.controller;

import java.security.SecureRandom;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private long phoneNumber ;
    private String gender;
    private short age;
    private String address;
    private int key;

   public Student(int studentId, String firstName, String lastName, long phoneNumber, String gender, short age, String address)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public Student()
    {

    }

    public int getStudentId() {
       /*
        This method will generate a 5 digit random numbers for the student number
        Each student will have a unique student number...
        */
        SecureRandom random = new SecureRandom();
        studentId = random.nextInt(100000);
        String formatted = String.format("%05d", studentId);
        return studentId;

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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getKey()
    {
        return key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public String toString() {
       /*
            I have override the toString method to display everything according to my liking
        */
        return "\n Student ID: " + studentId + "\n" + " First name: "+ firstName + "\n" + " Last name: " + lastName + "\n" + " Phone number: " + phoneNumber + "\n" + " Gender: " + gender + "\n" + " Age: " + age + "\n" + " Address: " + address +"\n";
    }
}
