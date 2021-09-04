package com.xgileit.learning.student.controller;

public class Student {

    private Integer studentId;
    private String firstName;
    private String lastName;
    private long phoneNumber ;
    private String gender;
    private short age;
    private String address;
    private int key;

    /**
     * I did not initialize the studentNumber in this constructor, because i'm going to generate
     * a random studentNumber for each Student Object being created.
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param gender
     * @param age
     * @param address
     */
   public Student(String firstName, String lastName, long phoneNumber, String gender, short age, String address)
    {
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

    public Integer getStudentId() {

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


    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String toString() {
       /**
         * @return
        * I have override the toString method to display everything according to my liking
        */
        return " First name: "+ firstName + "\n"
                + " Last name: " + lastName + "\n"
                + " Phone number: " + phoneNumber + "\n"
                + " Gender: " + gender + "\n" + " Age: "
                + age + "\n" + " Address: " + address +"\n }";
    }
}
