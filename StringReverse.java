public class StringReverse {

    public static void main(String[] args)
    {

        //Pass the name and reverse it
        // without using String reverse method...


        String name = "Linda";
        String reverse = "";


        for (int i = name.length()- 1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);
    }
}
