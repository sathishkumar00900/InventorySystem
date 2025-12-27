package view;

import model.User;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner = new Scanner(System.in);

    public int displayLoginSystem() {

        System.out.println("  1.SignUp (If you're a new User)");
        System.out.println("  2.SignIn (Have an account)");
        System.out.println("Enter Your Choice");

        int choice = scanner.nextInt();
        return choice;
    }
    public User getDetails() {

        User user = new User();
        System.out.println("Enter the username");
        String username = scanner.next();
        user.setUsername(username);

        System.out.println("Enter the password");
        String password = scanner.next();
        user.setPassword(password);

        return user;
    }
}
