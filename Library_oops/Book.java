package Library_oops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Book {
    public int bookId;
    private String bookName;
    private double bookPrice;
    private String author;

    public void displayBookDetails() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Book.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
            String everything = sb.toString();
            System.out.println(everything);
            br.close();
        }
    }
    public int getBookId()
    {
        SecureRandom random = new SecureRandom();
        bookId = random.nextInt(100000);
        String formatted = String.format("%05d", bookId);
        return bookId;
    }

    public String getBookName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you First Name");
        bookName = scan.nextLine();
        return bookName;
    }

    public double getBookPrice()
    {
        String price = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the price of the book");
        price = scanner.nextLine();
        bookPrice = Double.parseDouble(price);
        return bookPrice;
    }

    public String getAuthor()
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter you First Name");
            author = scan.nextLine();
            return author;
    }

    public void Addbooks()
    {
        Book book = new Book();
        bookId = book.getBookId();
        bookName = book.getBookName();
        bookPrice = book.getBookPrice();
        author = book.getAuthor();

        System.out.println("The new book you added is \n" + "Book ID: " + bookId + "\n" + "Book name " + bookName + "\n" + "Book price R " + bookPrice + "\n" + "Author " + author);
    }

}
