package ExceptionHandling;

public class CatchArray {

    public void ArrayOutOfBound()
    {
        //Array length of number is 2 but here we are try to print a value in position 2
        try {
            int[] number = new int[2];
            System.out.println(number[3]);

        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("You are trying to access a number that is unavailable" + ex);
        }

    }
}
