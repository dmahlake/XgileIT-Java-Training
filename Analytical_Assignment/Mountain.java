package Analytical_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Mountain {

    ArrayList<Integer> input = new ArrayList<>();

    public void mountainHike()
    {
        //Prompting the user to enter length of list...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of your mountain");
        int length = scanner.nextInt();

        //prompting the user to enter the list values and storing them in an arraylist
        for (int i = 1; i <= length; i++)
        {
            System.out.println("Please enter value number " + i);
            input.add(scanner.nextInt());
        }

        //Displaying the input values
        System.out.println("Input values are : \n" + input);
    }

    public int lowestValley()
    {
        //Finding the lowest valley...

        int lowest = input.get(0);
        for (int i = 0; i < input.size(); i++)
        {
            if (input.get(i) < lowest)
            {
                lowest = input.get(i);
            }
        }
        return lowest;
    }

    public int highestPeak()
    {
        //finding highest peak...

        int highest = input.get(0);
        for (int i = 0; i < input.size(); i++)
        {
            if (input.get(i) > highest)
            {
                highest = input.get(i);
            }
        }
        return highest;
    }

    public int diffHighestLowest()
    {
        //Difference between lowest valley and highest peak

        return highestPeak() - lowestValley();
    }

    public boolean isTable()
    {
        //checking if we have a table on our mountain
       for (int i = 1; i < input.size(); i++)
       {
           if (input.get(i).equals(input.get(i - 1)))
           {
               return true;
           }
       }
       return false;
    }

}
