package lesson_5.BankApp.Controller;

import lesson_5.BankApp.Model.User;
import lesson_5.BankApp.View.BankAppView;

public class BankAppController {
    private final UserController userController;
    private final BankAppView bankAppView;
    private User user;

    public BankAppController(UserController userController, BankAppView bankAppView) {
        this.userController = userController;
        this.bankAppView = bankAppView;
    }

    public void start() {
        bankAppView.welcomeMessage();
        int choice = -1;
        while (choice != 5) {
            bankAppView.startMessage();
            choice = bankAppView.getChoiceLogin();
            switch (choice) {
                case 1:
                    inputLogin();
                    break;
                case 2:
                    createLogin();
                    break;
                case 3:
                    userController.removeUser(userController.getUserByEmail(bankAppView.innEmail()));
                    System.out.println("Пользователь удалён!");
                    break;
                case 4:
                    System.out.println(userController.getUsers());
                    break;
                case 5:
                    bankAppView.exit();
                    break;
                default:
                    bankAppView.errorChose();
            }
        }
    }

    private User inputLogin() {
        String email = bankAppView.innEmail();
        String password = bankAppView.innPassword();
        user = userController.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            runBankApp(user);
        } else {
            bankAppView.errorInnLogin();
        }
        return null;
    }

    private void createLogin() {
        userController.addUser(bankAppView.innName(), bankAppView.innEmail(), bankAppView.innPassword(), bankAppView.innDeposit());
        bankAppView.createComplete();
    }

    private void runBankApp(User user) {
        int choice = -1;
        while (choice != 4) {
            bankAppView.displayMenu();
            choice = bankAppView.getChoiceAmount();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    System.out.println("Ваш баланс: " + user.getBalance());
                    break;
                case 4:
                    bankAppView.exit();
                    break;
                default:
                    bankAppView.errorChose();
            }
        }
    }

    private void deposit() {
        int amount = bankAppView.getAmount();
        userController.deposit(user, amount);
        System.out.println("$" + amount + "  было зачислен на ваш счет.");
    }

    private void withdraw() {
        int amount = bankAppView.getAmount();
        userController.withdraw(user, amount);
        System.out.println("$" + amount + " было снято с вашего аккаунта.");
    }
}
