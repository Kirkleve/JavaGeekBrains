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
        System.out.println("Есть ли у вас аккаунт?");

    }

    public String innEmail() {
        System.out.print("Введите ваш email: ");
        return scanner.next();
    }

    public String innPassword() {
        System.out.print("Введите ваш пароль: ");
        return scanner.next();
    }

    public String innName() {
        System.out.println("Введите ваше имя: ");
        return scanner.next();
    }

    public int innDeposit() {
        System.out.println("Ваш депозит: ");
        return scanner.nextInt();
    }

    public void displayMenu() {
        System.out.println("1. Депозит");
        System.out.println("2. Вывод средств");
        System.out.println("3. Показать баланс");
        System.out.println("4. Выход");
    }

    public int getChoiceLogin() {
        System.out.print("Выберете: \n1 - да\n2 - нет\n");
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
}
