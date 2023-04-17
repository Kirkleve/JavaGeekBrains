package lesson_4.Seminar;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //arrayListInt.add(i);
            arrayListInt.add(arrayListInt.size() / 2, i);
        }
        System.out.println("ArrayList");
        System.out.println(System.currentTimeMillis() - time);

        LinkedList<Integer> linkInt = new LinkedList<>();
        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //linkInt.add(i);
            linkInt.add(linkInt.size() / 2, i);
        }
        System.out.println("LinkedList");
        System.out.println(System.currentTimeMillis() - time2);
    }
}
