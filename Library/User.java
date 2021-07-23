package Library;

import java.security.SecureRandom;
import java.util.Scanner;

public class User {

    private int userId;
    private String name;
    private String surname;
    private String address;
    private long phoneNumber;
    public int noOfBooks;

    public String userName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you First Name");
        name = scan.nextLine();
        return name;
    }

    public String userSurname()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you Surname");
        surname = scan.nextLine();
        return surname;
    }

    public String userAddress()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you Address");
        address = scan.nextLine();
        return address;
    }

    public long phoneNumber()
    {
        String number = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mobile number");
        number = scanner.nextLine();
        phoneNumber = Long.parseLong(number);

        return phoneNumber;
    }

    public int books()
    {
        String number = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many books do you want to borrow");
        number = scanner.nextLine();
        noOfBooks = Integer.parseInt(number);

        return noOfBooks;
    }

    public int userId()
    {
        SecureRandom random = new SecureRandom();
        userId = random.nextInt(100000);
        String formatted = String.format("%05d", userId);
        return userId;
    }

    public void display()
    {
        User user = new User();
        userId = user.userId();
        name = user.userName();
        surname = user.userSurname();
        address = user.userAddress();
        phoneNumber = user.phoneNumber();
        System.out.println("***Thank you for registering to our System***" + "\n" + "Double check your information below");
        System.out.println("User ID : "+ userId + "\n" + "First name : " + name + "\n" + "Surname : " + surname + "\n" + "Address : " + address + "\n"
                           + "Phone Number : " + phoneNumber);
    }


}
