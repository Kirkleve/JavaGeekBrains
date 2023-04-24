package lesson_5.Seminar.view;

import lesson_5.Seminar.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        System.out.println("Enter your data");
        Scanner scanner = new Scanner(System.in);
//        userController.addNewUser(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
        userController.addNewUser("Kirill", 30, 30000);
        userController.addNewUser("Polina", 27, 29000);
        userController.addNewUser("ina", 23, 123124);
        userController.addNewUser("lola", 29, 1234);
        userController.addNewUser("igor", 20, 43212);
        System.out.println(userController);
        System.out.println(userController.getUser(2));
        userController.deleteUser(2);
        System.out.println(userController);
    }
}
