import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateYourAge {

    public static void main(String[] args)
    {
        //Enter your date of birth and
        // find out how many days you spend
        // already in planet years...

        LocalDate dateOfBirth = LocalDate.of(1993, 03, 26);
        LocalDate today = LocalDate.now();
        //Period difference = Period.between(dateOfBirth, today);

        long noOfDays = ChronoUnit.DAYS.between(dateOfBirth, today);

        System.out.println("You have been living on this planet for " + noOfDays + "days");


        //System.out.println("You have been living on this planet for " + difference.getYears() + " years" + difference.getDays() + "Days");
        //(difference.getYears() + "years" + difference.getMonths() + "months" + difference.getDays() + "days");
       // System.out.println("You have been living on this planet for " + difference.getDays() + " Days");
    }
}
