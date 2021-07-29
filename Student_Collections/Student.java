package Student_Collections;

import java.util.Comparator;
public class Student {

    int studentID;
    int grade;
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Student(int studentID, int grade, String name, String surname)
    {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public static Comparator<Student> StudentGrade = new Comparator<Student> (){

        public int compare(Student s1, Student s2) {

            int grade1 = s1.getGrade();
            int grade2 = s2.getGrade();

            /*For ascending order*/
            return grade1-grade2;

        }
    };

    @Override
    public String toString() {
        return "[ Student ID " + studentID + ", Grade = " + grade + ", Name = " + name + " Surname " + surname + " ]";
    }

}

//I used this class to compare grades and sort them
//Comparing the grade of all the students.

/*class AccordingGrade implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        return s1.getGrade().compareTo(s2.getGrade());
    }
}*/




