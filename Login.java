import java.util.Scanner;

public class Login extends CreatingAccount {
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);

    public void signin() {
        System.out.println("Log in to your account.");
        System.out.print("Enter your ID: ");
        int x = s1.nextInt(); //x will take id as input from the user
        if (x == id) {
            password();
        } else {
            while (x != id) {
                System.out.print("Invalid ID Number. \nRe-enter ID Number: ");
                x = s1.nextInt();
            }
            password();
        }
    }

    public void password() {
        System.out.print("Enter your password: ");
        String str = s2.nextLine();//str will take password as input from the user
        if (str.equals(pass1)) {
            System.out.println("Logged into your account");
        } else {
            //System.out.println("Invalid Password");
            while (!(str.equals(pass2))) {
                System.out.print("Password does not match. \nRe-enter your password: ");
                str = s2.nextLine();
            }
            System.out.println("Logged into your account");
        }
    }
}

