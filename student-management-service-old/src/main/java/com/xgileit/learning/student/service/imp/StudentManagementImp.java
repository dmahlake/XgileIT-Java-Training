package com.xgileit.learning.student.service.imp;

import com.xgileit.learning.student.entity.Student;

import java.util.TreeMap;

public class StudentManagementImp {

    /**
    * I  using treeMap to save my students data
    * Declaring treemap as an instance variable is for the scope of the data
    * I am using different methods to add student, update and delete students
    * this way makes everythings easier
     */
    TreeMap<Integer, Student> studentList = new TreeMap<>();
    Student student = new Student();

    public void displayStudents()
    {
        /*try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "12345");
            //create Statement
            Statement myState = myConn.createStatement();
            //execute sql results query
            ResultSet results = myState.executeQuery("Select * from student");
            //process the result set
            while(results.next())
            {
                System.out.println(results.getString("student_first_name") + ", "
                        + results.getString("student_last_name") + ", " + results.getString("student_email"));
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }*/

    }

    public void addStudent() {
        /*

        /**
            This method will add student to the list
            will ask ask you how many students to you want to add
            it is up to you to decide how many students you want to add
            you will be prompted to enter the student details...

        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "12345");
            //create Statement
            Statement myState = myConn.createStatement();
            //execute sql results query
            ResultSet results = myState.executeQuery("INSERT INTO student VALUES(Lerato, Mohole, lerato@gmil.com, 70)");
            //process the result set
            while(results.next())
            {
                System.out.println(results.getString("student_first_name") + ", "
                        + results.getString("student_last_name") + ", " + results.getString("student_email") + results.getString("grade"));
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }



        /*Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to add");
        int numberStudent = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt();
        student.setStudentId(randomNumber);

        for (int i = 0; i < numberStudent; i++) {

            System.out.println("Please enter student first name");
            student.setFirstName(scanner.next());

            System.out.println("Please enter student last name");
            student.setLastName(scanner.next());

            System.out.println("Please enter your student phone Number");
            student.setPhoneNumber(scanner.nextLong());

            System.out.println("Please enter student gender");
            student.setGender(scanner.next());

            System.out.println("Please enter student age");
            student.setAge(scanner.nextShort());

            System.out.println("Please enter student address");
            student.setAddress(scanner.next());

            studentList.put(student.getStudentId(), new Student(student.getFirstName(), student.getLastName(), student.getPhoneNumber(), student.getGender(), student.getAge(), student.getAddress()));
        }

        System.out.println(studentList);*/


    }

    public void deleteStudent() {
        /*
        /**
            This method will delete a particular student from the list
            We are using a key to delete a student because the is no way a key can be a duplicate
            When the student you want to delete doesnt exist you will receive a message student
            doesnt exist...


        try {
           if ( studentList.containsKey(student.getStudentId())) {
               studentList.remove(student.getStudentId());
           }
        }
        catch (NullPointerException ex)
        {
            System.out.println("You are trying to remove a value that does'nt exist" + ex);
        }
        System.out.println("After deleting a student \n" + studentList);
*/
    }

    public void searchStudent() {

        /*
        /**
            This method search for student and it will return everything about the student
            Also on this method we are using the key also to search student
            When a student don't exist you will receive message no such student


        try{
            studentList.get(student.getStudentId());
            System.out.println("The results of the searched student\n " + studentList);
        }
        catch (NullPointerException ex)
        {
            System.out.println("Sorry no records returned try another student" + ex);
        }*/

    }


    /**
     *  This message will update student information
     * incase a student want to change their phone number, Address
     *  It will replace old values with new values...
     */
    public void updateStudent() {



       // studentList.replace(student.getStudentId(),  new Student("Dimpho", "Moetanalo", 112532, "Female", (short) 23, "Witbank"));
       // System.out.println("Updated info\n " + studentList);
    }
}

