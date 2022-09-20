package lesson_5.homeWork;
/*
1. Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.HashMap;
import java.util.LinkedList;
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

    public static String formatOutput (Map<String, LinkedList<String>> phoneBook) {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, LinkedList<String>> item: Task1.phoneBook.entrySet()) {
            output.append(item.getKey()).append(":\n");
            output.append(item.getValue().toString()).append("\n");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        addItem("Max", "325235235");
        addItem("Max", "236326236");
        addItem("igor", "2352352323");
        addItem("Kirill", "89520565555");
        phoneBook.remove("igor");
        System.out.println(formatOutput(phoneBook));
    }
}
