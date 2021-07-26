package Library_oops;

import java.security.SecureRandom;
import java.util.Scanner;

public class Librarian {
    private String name;
    private String surname;
    private int librarianID;

    public int LibraryID()
    {
        SecureRandom random = new SecureRandom();
        librarianID = random.nextInt(100000);
        String formatted = String.format("%05d", librarianID);
        return librarianID;
    }

    public String librarianName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you First Name");
        name = scan.nextLine();
        return name;
    }

    public String librarianSurname()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you Surname");
        surname = scan.nextLine();
        return surname;
    }
}
