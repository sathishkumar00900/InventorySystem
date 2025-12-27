package controller;

import dao.dbOperations;
import model.LoginModel;
import model.User;
import view.LoginView;

public class LoginController {

    private LoginView lv;
    private LoginModel lm;

    public LoginController() {
        this.lm = new LoginModel();
        this.lv = new LoginView();
    }

    public void run() {

        int choice = lv.displayLoginSystem();

        User user = lv.getDetails();

        if(choice == 1) {
            boolean status = new dbOperations().addUser(user);

            if(status) {
                System.out.println("You Will be redirected");
                User user1 = lv.getDetails();

                boolean sts = new dbOperations().authUser(user1);
            }

        }
        else {

        }
    }

}
