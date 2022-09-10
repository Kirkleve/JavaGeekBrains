package lesson_3.lesson;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        /*
        Заполнить список названиями планет солнечной системы
        в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке
         */
        List<String> planet = List.of("Венера", "Марс", "Юпитер", "Земля", "Сатурн", "Плутон");
        Random rnd = new Random();
        ArrayList list = new ArrayList();
        int index;
        for (int i = 0; i < 15; i++) {
            index = rnd.nextInt(5);
            list.add(planet.get(index));
        }
        int count = 0;
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            count++;
            if (!list.get(i).equals(list.get(i+1))) {
                System.out.println(list.get(i) + " - " + count + "\n");
                count = 0;
            }
        }
        System.out.println(list.get(list.size()-1) + " - " + (count+1) + "\n");

        int i = 0;
        while (i < list.size()-1) {
            if (list.get(i).equals(list.get(i+1))) {
                list.remove(list.get(i));
            } else {
                i++;
            }
        }
        System.out.println(list);
    }
}
