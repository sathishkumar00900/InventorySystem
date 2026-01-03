package view;

import java.util.Scanner;

public class LoginView extends BaseView {

    Scanner sc = new Scanner(System.in);

    public String getUsername() {
        System.out.print("Enter Username: ");
        return sc.nextLine();
    }

    public String getPassword() {
        System.out.print("Enter Password: ");
        return sc.nextLine();
    }
}
