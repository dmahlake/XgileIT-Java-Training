package ExceptionHandling;

import java.util.Scanner;

public class WrongFormat{

    public void NumberFormat()
    {
        //When a user enter something other than a number the catch block will be executed
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter any number");
            int number = Integer.parseInt(scan.next());
            System.out.println("Your number is " + number);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Please enter the correct number" + ex);
        }
    }
}
