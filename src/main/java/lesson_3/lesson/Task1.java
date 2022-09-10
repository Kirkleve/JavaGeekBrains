package lesson_3.lesson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
        */
        int length = 10;
        ArrayList<Integer> arrayList = fillArray(length);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
    }
    private static ArrayList<Integer> fillArray (int length) {
        ArrayList <Integer> List = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            List.add(rnd.nextInt());
        }
        return List;
    }
}
