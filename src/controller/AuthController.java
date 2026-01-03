package controller;
import model.Role;
import model.User;
import util.AuthorizationUtil;
import view.AdminView;
import view.LoginView;
import view.StaffView;


public class AuthController {

    private LoginView lv;

    public AuthController() {
        this.lv = new LoginView();
    }

    public void run() {

        lv.displayWelcome();
        while (true) {
            User user = getAuth();

            if (user.getRole() == Role.ADMIN) {
                new AdminView().showMenu();
            } else {
                new StaffView().showMenu();
            }
            System.out.println("Redirecting to login...\n");
        }
    }

    public User getAuth() {
        String username = lv.getUsername();
        String password = lv.getPassword();

        User user = new AuthorizationUtil().login(username, password);
        if (user == null) {
            System.out.println("Invalid credentials! Pls Enter the Details Correctly");
            return getAuth();
        }
        return user;
    }






}
