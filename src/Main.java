import controller.LoginController;
import view.BaseView;

public class Main {
    public static void main(String[] args) {

        new BaseView().displayWelcome();
        LoginController login = new LoginController();

        login.run();
    }
}