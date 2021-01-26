import java.util.Scanner;
import java.util.Random;

public class CreatingAccount {
    public static String name, email, pass1, pass2;
    public static int cell;
    public static int id;
    Random rand = new Random();
    Scanner x = new Scanner(System.in);
    Scanner y = new Scanner(System.in);

    public void signup() {
        System.out.println("Signing up for an account.");
        System.out.print("Enter Full name: ");
        name = x.nextLine();
        System.out.print("Enter Mobile Number: +88");
        cell = x.nextInt();
        System.out.print("Enter Email Address: ");
        email = y.nextLine();
        System.out.print("Create your own password: ");
        pass1 = y.nextLine();
        System.out.print("Re-enter the password for verification: ");
        pass2 = y.nextLine();
        if (pass1.equals(pass2)) {
            id = rand.nextInt(2000000);
            System.out.println("Password matched");
            System.out.println("Congratulations! Account successfully created");
            System.out.println("Your ID number is " + id);
        } else {
            for (int i = 0; !(pass1.equals(pass2)); i++) {
                System.out.print("Password does not match. \nRe-enter your password: ");
                pass2 = y.nextLine();
            }
            System.out.println("Password matched");
            System.out.println("Congratulations! Account successfully created");
            System.out.println("Your ID number is " + id);
        }

    }
}
