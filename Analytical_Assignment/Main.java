package Analytical_Assignment;

public class Main {

    public static void main(String[] args)
    {
        //Displaying everything about mountain
        Mountain mountain = new Mountain();
        mountain.mountainHike();
        int minimum = mountain.lowestValley();
        int maximum = mountain.highestPeak();
        int difference = mountain.diffHighestLowest();
        boolean table = mountain.isTable();

        System.out.println("The highest peak : " + maximum);
        System.out.println("The lowest valley : " + minimum);
        System.out.println("The difference between highest peak and lowest valley is : " + difference);
        System.out.println("Do we have a table : " + table);
        System.out.println();
        System.out.println("###########################");
        System.out.println("Now we are checking values for Market share");
        System.out.println();

        //Displaying everything about market share
        ShareMarket shareMarket = new ShareMarket();
        shareMarket.market();
        shareMarket.checkRiseFallNumbers();
    }
}
