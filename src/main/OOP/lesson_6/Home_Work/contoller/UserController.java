package lesson_6.Home_Work.contoller;

import lesson_6.Home_Work.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
