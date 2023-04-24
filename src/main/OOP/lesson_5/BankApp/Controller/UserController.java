package lesson_5.BankApp.Controller;

import lesson_5.BankApp.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private final List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public void addUser(String name, String email, String password, int balance) {
        User user = new User(name, email, password, balance);
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public void deposit(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }

    public void withdraw(User user, int amount) {
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
        } else {
            System.out.println("Недостаточно средств для вывода.");
        }
    }

    @Override
    public String toString() {
        return "All Users{" +
                users +
                '}';
    }
}
