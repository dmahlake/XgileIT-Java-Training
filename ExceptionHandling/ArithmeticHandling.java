package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticHandling {

    public void Arithmetic()
    {
        //Dividing any number by 0 will results in null pointer exception
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a value of your choice");
            int value = scanner.nextInt();
            System.out.println("Average = " + 20 / value);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Please enter another value other than zero " + ex);
        }
    }
}
