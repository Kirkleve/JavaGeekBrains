package lesson_5.BankApp.View;

import java.util.Scanner;

public class BankAppView {
    private final Scanner scanner;

    public BankAppView() {
        this.scanner = new Scanner(System.in);
    }

    public void welcomeMessage() {
        System.out.println("Добро пожаловать в Банк!");
    }

    public void startMessage() {
        System.out.println("Выберете действие: ");

    }

    public String innEmail() {
        System.out.print("Введите email: ");
        return scanner.next();
    }

    public String innPassword() {
        System.out.print("Введите пароль: ");
        return scanner.next();
    }

    public String innName() {
        System.out.println("Введите имя: ");
        return scanner.next();
    }

    public void createComplete() {
        System.out.println("Логин создан!");
    }

    public int innDeposit() {
        System.out.println("Депозит: ");
        return scanner.nextInt();
    }

    public void displayMenu() {
        System.out.println("1. Депозит");
        System.out.println("2. Вывод средств");
        System.out.println("3. Показать баланс");
        System.out.println("4. Выход");
    }

    public int getChoiceLogin() {
        System.out.print("Выберете: \n" +
                "1 - Вход\n" +
                "2 - Создать логин и пароль\n" +
                "3 - Удалить логин\n" +
                "4 - Показать пользователей\n" +
                "5 - Выход\n");
        return scanner.nextInt();
    }

    public int getChoiceAmount() {
        System.out.print("Выберете от 1 до 4: ");
        return scanner.nextInt();
    }

    public int getAmount() {
        System.out.print("Пожалуйста, введите сумму: ");
        return scanner.nextInt();
    }

    public void errorInnLogin() {
        System.out.println("Неверный адрес электронной почты или пароль.");
    }

    public void errorChose() {
        System.out.println("Неверный выбор!");
    }

    public void exit() {
        System.out.println("Выход...");
    }
}
