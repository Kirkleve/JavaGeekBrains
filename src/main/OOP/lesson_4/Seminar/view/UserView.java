package lesson_4.Seminar.view;

import lesson_4.Seminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
