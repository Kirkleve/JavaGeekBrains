package lesson_6.Lesson;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Процент уникальных чисел = " + percent(fillArray(24, 1000)) + " %");
    }

    public static List<Integer> fillArray(int maxNumber, int count) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(rnd.nextInt(maxNumber));
        }
        return numbers;
    }

    public static Double percent(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        return setNumbers.size() * 100.0 / numbers.size();
    }
}
