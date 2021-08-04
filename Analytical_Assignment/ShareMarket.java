package Analytical_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ShareMarket {

    ArrayList<Integer> userInput = new ArrayList<>();

    public void market()
    {
        //Prompting the user to enter length of list...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of your market share");
        int length = scanner.nextInt();

        //prompting the user to enter the list values and storing them in an arraylist
        for (int i = 1; i <= length; i++)
        {
            System.out.println("Please enter value number " + i);
            userInput.add(scanner.nextInt());
        }

        //Displaying the input values
        System.out.println("Input values are : \n" + userInput);
    }

    public void checkRiseFallNumbers()
    {
        //checking the numbers of fall and rise
        //When we have falls we will save those fall number inside our fall list
        //every time it rises we will save those numbers inside rise list
        int fallNumber = userInput.get(0);
        int riseNumber = userInput.get(0);
        ArrayList<Integer> fall = new ArrayList<>();
        ArrayList<Integer> rise = new ArrayList<>();
        for (int i = 0; i < userInput.size(); i++)
        {
            if (userInput.get(i) < fallNumber)
            {
                fall.add(userInput.get(i));
            }
            else if (userInput.get(i) > riseNumber)
            {
                rise.add(userInput.get(i));
            }
        }
        System.out.println("Fall " + fall);
        System.out.println("Rise " + rise);
    }


}
