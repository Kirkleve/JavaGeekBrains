package lesson_4.Seminar.controller;

import lesson_4.Seminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
