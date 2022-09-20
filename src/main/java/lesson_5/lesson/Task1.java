package lesson_5.lesson;

import java.util.List;
import java.util.Map;

public class Task1 {

    public static Map<Integer, String> passport = Map.of(
            123456, "Иванов",
            321456, "Васильев",
            234561, "Петрова",
            234432, "Иванов",
            654321, "Петрова",
            345678, "Иванов");

    public static Map<String, List<Integer>> surnameMap = Map.of(
            "Иванов", List.of(123456, 234432, 345678),
            "Петрова", List.of(234561, 654321),
            "Васильев", List.of(321456));

    public static void main(String[] args) {
        /*
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        passportNumberBySurname1("Иванов");
        passportNumberBySurname2("Иванов");
    }

    public static void passportNumberBySurname1(String surname) {
        var entries = passport.entrySet();
        System.out.print(surname + ": ");
        for (Map.Entry<Integer, String> entry : entries) {
            if (entry.getValue().equals(surname)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void passportNumberBySurname2(String surname) {
        System.out.println("\n" + surname + ": " + surnameMap.get(surname));
    }
}
