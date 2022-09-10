package lesson_3.homeWork;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
        */
        Random rnd = new Random();
        int length = 10;
        ArrayList<Integer> list = fillArray(length);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
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
