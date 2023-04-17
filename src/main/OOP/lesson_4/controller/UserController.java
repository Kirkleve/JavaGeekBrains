package lesson_4.controller;

import lesson_4.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
