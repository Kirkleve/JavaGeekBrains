package lesson_5.Seminar.repository;

import lesson_5.Seminar.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> db = new ArrayList<>();

    public void addUser(User user) {
        db.add(user);
        user.setUserID(db.size());
    }

    public void deleteUser(int userID) {
        db.removeIf(us -> us.getUserID().equals(userID));
    }

    public User getUser(int userID) {
        for (User us : db) {
            if (us.getUserID().equals(userID)) {
                return us;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return db.toString();
    }

    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("src/main/OOP/lesson_5/BD.txt", true)) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
