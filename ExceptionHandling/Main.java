package ExceptionHandling;

public class Main {

    public static void main(String[] args)
    {
        //Handling ArithmeticException
        ArithmeticHandling arithmeticHandling = new ArithmeticHandling();
        arithmeticHandling.Arithmetic();
        
        //Handling NullPointerException
        CatchNull cat = new CatchNull();
       cat.NullException();
        
        //Handling NumberFormatException
       WrongFormat wrongFormat = new WrongFormat();
       wrongFormat.NumberFormat();
        
        //Handling ArrayIndexOutOfBound
       CatchArray catchArray = new CatchArray();
       catchArray.ArrayOutOfBound();
        
        //Handling StringIndexOutOfBound
        StringIndex stringIndex = new StringIndex();
        stringIndex.StringIndexBound();
    }
}
