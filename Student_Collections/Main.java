package Student_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

   /* static void addStudents()
    {
        Student stud = new Student(0,""," ");

        //TreeMap is convinience because it will sort your data based on your key
        //When you print your data it is already sorted so the is no need for you to sort.
        // I can add a new student at the end it will still sotr it from lowest to highest
            TreeMap<Student, Integer> student = new TreeMap<Student, Integer>(new AccordingGrade());
            student.put(new Student(82, " Dipuo", "Mahlake"), 10);
            student.put(new Student(70, " Joyce", "Skefu"), 7);
            student.put(new Student(50, " Laura", "Mahlangu"), 3);
            student.put(new Student(87, " Zodwa", "Phakathi"), 8);
            student.put(new Student(77, " Patience", "Mahlake"), 1);

            //Removing student with key 3.
            // student.remove(3);
        //Printing a particular students grade.
        //I used getkey method to retrieve the value of the student
        System.out.println("Student details and grade = " + student.get(8));
        System.out.println("TreeMap: "
                + student);
    }*/

   static void addNewStudents()
    {

        //ArrayList is easier to add, remove, iterate and sort.
        //ArrayList allow null values
        //I can remove any student from the list which makes it easier

        // Adding new student to our list of students
        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student(2124,82," Dipuo", "Mahlake" ));
        student.add(new Student(2125,70," Joyce", "Skefu"));
        student.add(new Student(2127,50," Laura", "Mahlangu"));
        student.add(new Student(2129,87," Zodwa", "Phakathi"));
        student.add(new Student(2130,77," Patience", "Mahlake"));

        //printing grade for a particular student
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).equals(student.get(3))) {
                System.out.println("Student "+ student.get(i).getName() + " " + student.get(i).getSurname()+ " got " + student.get(i).getGrade() + " in Java");
                break;
            }

        }
        //Removing student at index
        //when we print list of students the student at index 2 wont appear
        student.remove(2);

        //Sorting and printing student by their grade
        //from lowest to highest
        Collections.sort(student, Student.StudentGrade);

        for(Student str: student){
            System.out.println(str);
        }
    }

    public static void main(String[] args)
    {
        addNewStudents();
    }
}
