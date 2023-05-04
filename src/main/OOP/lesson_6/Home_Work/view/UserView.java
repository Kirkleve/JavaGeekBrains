package lesson_6.Home_Work.view;

import lesson_6.Home_Work.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
