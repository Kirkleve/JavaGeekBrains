package lesson_5.BankApp;

import lesson_5.BankApp.Controller.BankAppController;
import lesson_5.BankApp.Controller.UserController;
import lesson_5.BankApp.View.BankAppView;

public class BankApp {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.addUser("Kirill", "kirill@bank.com", "123", 0);

        BankAppView bankAppView = new BankAppView();
        BankAppController bankAppController = new BankAppController(userController, bankAppView);
        bankAppController.start();
    }
}
