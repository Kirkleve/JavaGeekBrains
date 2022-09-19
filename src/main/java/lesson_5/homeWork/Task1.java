package lesson_5.homeWork;
/*
1. Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static Map<String, LinkedList<String>> phoneBook = new HashMap<>();
    public static void addItem(String name, String phoneNumber) {
        LinkedList<String> item;
        if(phoneBook.containsKey(name)) {
            item = phoneBook.get(name);
            item.add(phoneNumber);
        } else {
            item = new LinkedList<>();
            item.add(phoneNumber);
            phoneBook.put(name, item);
        }
    }
    public static void main(String[] args) {
        addItem("Max", "325235235");
        addItem("Max", "236326236");
        addItem("igor", "2352352323");
        System.out.println(phoneBook);
    }
}
