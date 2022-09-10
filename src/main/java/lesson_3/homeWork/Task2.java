package lesson_3.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее из этого списка.
         */
        int length = 10;
        ArrayList<Integer> list = fillArray(length);
        System.out.println(list);
        System.out.println("Минимальное значение " + findMin(list));
        System.out.println("Максимальное значение " + findMax(list));
        int averageList = (int)average(list);
        System.out.println("Среднее значение " + averageList);
    }
    private static double average(List<Integer> list) {
        Integer sum = 0;
        if(!list.isEmpty()) {
            for (Integer i : list) {
                sum += i;
            }
            return sum.doubleValue() / list.size();
        }
        return sum;
    }
        private static int findMin (ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }
    private static int findMax (ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
    private static ArrayList<Integer> fillArray (int length) {
        ArrayList<Integer> List = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            List.add(rnd.nextInt(100));
        }
        return List;
    }
}
