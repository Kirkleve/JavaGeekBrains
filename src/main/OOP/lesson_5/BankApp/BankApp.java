package lesson_5.BankApp;

import lesson_5.BankApp.Controller.BankAppController;
import lesson_5.BankApp.Controller.UserController;
import lesson_5.BankApp.View.BankAppView;

public class BankApp {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.addUser("Kirill", "kirill@bank.com", "123", 0);
        userController.addUser("Ivan", "ivan@bank.com", "231", 0);
        userController.addUser("Sasha", "sasha@bank.com", "1242", 0);
        System.out.println(userController);
        userController.removeUser(userController.getUserByEmail("ivan@bank.com"));
        System.out.println(userController);

        BankAppView bankAppView = new BankAppView();
        BankAppController bankAppController = new BankAppController(userController, bankAppView);
        bankAppController.start();
    }
}
