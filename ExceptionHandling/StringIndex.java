package ExceptionHandling;

public class StringIndex {

    public void StringIndexBound()
    {
        try
        {
            //You are trying to access a value a position 20 but position 20 doesn't exist
            String str = "Hello World!!";
            System.out.println(str.charAt(20));
        }
        catch (StringIndexOutOfBoundsException ex)
        {
            System.out.println("You are trying to access invalid position try again " + ex);
        }
    }
}
