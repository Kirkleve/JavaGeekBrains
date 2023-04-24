package lesson_5.Seminar.service;

import lesson_5.Seminar.model.User;
import lesson_5.Seminar.repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();

    public void addUser(User user) {
        userRepo.addUser(user);
    }

    public void deleteUser(int userID) {
        userRepo.deleteUser(userID);
    }

    public User getUser(int userID) {
        return userRepo.getUser(userID);
    }

    @Override
    public String toString() {
        return userRepo.toString();
    }
}
