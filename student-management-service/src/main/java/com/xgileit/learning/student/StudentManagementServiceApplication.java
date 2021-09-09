package com.xgileit.learning.student;

import com.xgileit.learning.student.service.imp.StudentManagementImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StudentManagementServiceApplication {
	
	
	/**
            This is the instruction or main menu you can do on this program.
            Each an every number do a different thing on the program...
	    We will call the all the methods besade on their numbers.
	    To do that we are using switch/case statement
	*/
	public static void main(String[] args) {

			SpringApplication.run(StudentManagementServiceApplication.class, args);
			StudentManagementImp studentManagementImp = new StudentManagementImp();
			
			System.out.println("***********Main menu****************");
			System.out.println("Please choose a number of which program you want to run...");
			System.out.println("**Press 1 Add new student**");
			System.out.println("**Press 2 Update student info**");
			System.out.println("**Press 3 Search for a student");
			System.out.println("**Press 4 Delete a student**");
			System.out.println("**Press 5 to exit the program**");

			Scanner scanner = new Scanner(System.in);

			while(scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				if (line.matches("[1-5]"))
				{
					int num = Integer.parseInt(line);
					switch(num)
					{
						case 1:
							studentManagementImp.addStudent();
							break;
						case 2:
							studentManagementImp.updateStudent();
							break;
						case 3:
							studentManagementImp.searchStudent();
							break;
						case 4:
							studentManagementImp.deleteStudent();
							break;
						case 5:
							System.exit(0);
							break;
						default:
							System.out.println("invalid input please try again");
							break;
					}
				}
			}
	}

}
