package HomeWork1;

import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"aabb", "aabbb", "aaabb"};
        String temp = " ";
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (temp.equals(array[j])){
                    count++;
                    System.out.println(count);
                    System.out.println(array[j]);
                }
                temp = array[j];
                System.out.println(temp);
            }

        }
    }
}
