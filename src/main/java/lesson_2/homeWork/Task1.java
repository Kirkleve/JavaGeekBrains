package lesson_2.homeWork;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Напишите метод, который определит тип (расширение) файлов из текущей папки
        и выведет в консоль результат вида
         */
        File file = new File("C:/MyLearning/java/JavaGeekBrains/src/main/java/lesson_2/homeWork/text.txt");
        String name = file.getName();
        String newName = "";
        int lastIndex = name.lastIndexOf(".") + 1;
        newName = name.substring(lastIndex);
        System.out.println(newName);
    }
}
