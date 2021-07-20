import java.util.Scanner;

public class IdenticalInputs {

    public static void main(String[] args)
    {
        //Get the input from user and
        //print them one by one as complete
        //number before and after decimal check if
        //both part are same then print identical...

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any decimal number of your choice");
        double d = scan.nextDouble();
        String str = Double.toString(d);
        String[] convert = str.split("\\.");

        int a = Integer.parseInt(convert[0]);
        int b = Integer.parseInt(convert[1]);

        if (a == b) {
            System.out.println(a);
            System.out.println(b);
            System.out.println("Identical");
        }
        else
        {
            System.out.println("Not Identical");
        }
    }
}
