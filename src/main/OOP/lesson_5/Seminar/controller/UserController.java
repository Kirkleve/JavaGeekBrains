package lesson_5.Seminar.controller;

import lesson_5.Seminar.model.User;
import lesson_5.Seminar.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void addNewUser(String name, int age, int cash) {
        userService.addUser(new User(name, age, cash));
    }
    public  void deleteUser(int userID){
        userService.deleteUser(userID);
    }

    public User getUser(int userID){
        return userService.getUser(userID);
    }

    @Override
    public String toString() {
        return userService.toString();
    }
}
