package lesson_5.lesson;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        /*
        Взять набор строк, например, мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
        Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
         */
        System.out.println(verse("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"));
    }

    public static TreeMap<Integer, List<String>> verse(String str) {
        TreeMap<Integer, List<String>> strIntTreeMap = new TreeMap<>();
        String[] strArray = str.replaceAll("[,.]", "").split(" ");
        for (String s : strArray) {
            int length = s.length();
            if (strIntTreeMap.containsKey(length)) {
                strIntTreeMap.get(length).add(s);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                strIntTreeMap.put(length, temp);
            }
        }
        return strIntTreeMap;
    }
}

