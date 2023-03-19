package lesson_6.Home_Work;

import java.util.*;

public class Notebook {
    private final String model;
    private final int ram;
    private final int hdd;
    private final String os;
    private final String color;

    public Notebook(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }


    public static void filterNotebooks(Set<Notebook> laptops, Map<String, String> filters) {
        for (Notebook laptop : laptops) {
            boolean passedFilter = true;
            for (String key : filters.keySet()) {
                String value = filters.get(key);
                switch (key) {
                    case "RAM":
                        if (laptop.getRam() < Integer.parseInt(value)) {
                            passedFilter = false;
                        }
                        break;
                    case "HDD":
                        if (laptop.getHdd() < Integer.parseInt(value)) {
                            passedFilter = false;
                        }
                        break;
                    case "OS":
                        if (!laptop.getOs().equals(value)) {
                            passedFilter = false;
                        }
                        break;
                    case "COLOR":
                        if (!laptop.getColor().equals(value)) {
                            passedFilter = false;
                        }
                        break;
                }
            }
            if (passedFilter) {
                System.out.println(laptop.getModel());
            }
        }
    }

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
        filterNotebooks(laptops, filters);
    }
}
