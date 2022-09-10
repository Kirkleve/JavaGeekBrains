package lesson_3.lesson;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();//В Object можно записать как строки так и другие переменные
        arr.add("fdfsdfdsfdsf");
        arr.add(123);

        boolean b1 = arr.get(0) instanceof String;//Проверка являеться ли 0 индекс list строкой
        boolean b2 = arr.get(0) instanceof Integer;//Проверка являеться ли числом
        /*
        Создать список типа ArrayList<Object>.
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
        */
        Random rnd = new Random();
        ArrayList<Object> list = new ArrayList<>();
        list.add("243feerfe");
        list.add(1241);
        list.add("adasfvdre");
        list.add(2323);
        list.add(324.12321);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
