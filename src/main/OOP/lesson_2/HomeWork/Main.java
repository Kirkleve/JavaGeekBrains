package lesson_2.HomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> laptops = new HashSet<>();
        laptops.add(new Notebook("Lenovo IdeaPad", 8, 512, "Windows 10", "Silver"));
        laptops.add(new Notebook("HP Spectre x360", 16, 256, "Windows 10", "Blue"));
        laptops.add(new Notebook("Apple MacBook Pro", 16, 1000, "macOS", "Silver"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        String keyInput = scanner.nextLine();
        Map<String, String> filters = new HashMap<>();
        switch (keyInput) {
            case "1":
                System.out.println("Введите минимальное значение ОЗУ:");
                String ramInput = scanner.nextLine();
                filters.put("RAM", ramInput);
                break;
            case "2":
                System.out.println("Введите минимальный объем ЖД:");
                String hddInput = scanner.nextLine();
                filters.put("HDD", hddInput);
                break;
            case "3":
                System.out.println("Введите операционную систему:");
                String osInput = scanner.nextLine();
                filters.put("OS", osInput);
                break;
            case "4":
                System.out.println("Введите цвет:");
                String colorInput = scanner.nextLine();
                filters.put("COLOR", colorInput);
                break;
        }
        Notebook.filterNotebooks(laptops, filters);
    }
}
