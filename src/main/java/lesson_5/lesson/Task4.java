package lesson_5.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        /*
        Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
        Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
         */
        System.out.println(verse("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"));

    }
    public static TreeMap<Integer, List<String>> verse (String str) {
        TreeMap<Integer, List<String>> strIntTreeMap = new TreeMap<>();
        String[] strArray = str.replaceAll("[,.]", "").split(" ");
        for (int i = 0; i < strArray.length; i++) {
            int length= strArray[i].length();
            if (strIntTreeMap.containsKey(length)) {
                strIntTreeMap.get(length).add(strArray[i]);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strArray[i]);
                strIntTreeMap.put(length, temp);
            }
        }
        return strIntTreeMap;
    }
}
