package Library_oops;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User customer = new User();
        Book book = new Book();
        Payments pay = new Payments();


        System.out.println("***********Main menu****************");
        System.out.println("**Press 1 Register new member**");
        System.out.println("**Press 2 Display book details**");
        System.out.println("**Press 3 Register new book");
        System.out.println("**Press 4 Generate customer bill**");
        System.out.println("**Press 5 to exit the program**");
        System.out.println("Please choose a number of which program you want to run...");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if (line.matches("[0-5]"))
            {
                int num = Integer.parseInt(line);
                switch (num)
                {
                    case 1:
                        customer.display();
                        break;
                    case 2:
                        try {
                            Book bk = new Book();
                            bk.displayBookDetails();
                        }
                        catch (IOException ex)
                        {
                            System.out.println("File not found");
                        }
                        break;
                    case 3:
                        book.Addbooks();
                        break;
                    case 4:
                        pay.displayBill();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid input");
                        break;
                }
            }
            else
                System.out.println("Error: Invalid input.");
        }

    }
}
