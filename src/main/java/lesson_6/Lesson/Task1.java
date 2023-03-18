package lesson_6.Lesson;
/*
    1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
    2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
    3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
*/

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(1, 4, 3, 2, 4, 9, 6, 3));
        for (Integer numbers : set) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        Set<Integer> link = new LinkedHashSet<>(List.of(1, 4, 3, 2, 4, 9, 6, 3));
        for (Integer numbers : link) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        Set<Integer> tree = new TreeSet<>(List.of(1, 4, 3, 2, 4, 9, 6, 3));
        for (Integer numbers : tree) {
            System.out.print(numbers + " ");
        }
    }
}
