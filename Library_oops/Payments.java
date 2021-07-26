package Library_oops;

public class Payments {


    //Payment class is used to generate bill for customers and how much they are owing the library.
    public void displayBill()
    {
        Book book = new Book();
        User user = new User();

        int numberOfBook = user.books();
        double price = book.getBookPrice();

        System.out.println("Your bill is \n" + "Number of books borrowed " + numberOfBook +
                "\n" + "Price of book "+ price + "\n" + "Total " + (numberOfBook * price) + "\n"
                + "Thank you for your support\n Call again soon!!!");
    }
}
