package lesson_5.homeWork;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> peopleCountName = new HashMap<>();
        List<String> peopleName;
        try {
            peopleName = Files.readAllLines(Path.of("C:\\MyLearning\\java\\JavaGeekBrains\\src\\main\\java\\lesson_5\\homeWork\\peopleList.txt"));
        } catch (Exception ex) {
            System.out.println("Не удалось прочитать файл.");
            return;
        }

        for (String name : peopleName) {
            String firstName = name.split(" ")[0];
            if (peopleCountName.containsKey(firstName))
                peopleCountName.put(firstName, peopleCountName.get(firstName) + 1);
            else
                peopleCountName.put(firstName, 1);
        }
        System.out.println(peopleCountName);

        List<Map.Entry<String, Integer>> count = new ArrayList<>(peopleCountName.entrySet());
        count.removeIf(entry -> entry.getValue() < 2);
        count.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.printf("Повторяющиеся имена: %s", peopleCountName);
    }
}
