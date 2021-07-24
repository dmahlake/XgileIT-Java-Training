package ExceptionHandling;

public class CatchNull {

    public void NullException()
    {
        //String name has a value null trying to compare a null with a value will give you a pointer exception
        try{
            String name = null;
            if (name.equals("Dipuo"))
                System.out.println("Your name is " + name);
            else
                System.out.println("Doesn't match");
        }
        catch (NullPointerException ex)
        {
           System.out.println("Nullpointer Exception is caught" + ex);
        }
    }
}
