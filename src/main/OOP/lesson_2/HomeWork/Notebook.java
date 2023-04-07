package lesson_2.HomeWork;

import java.util.Map;
import java.util.Set;

public class Notebook implements Interface {
    protected String model;
    protected int ram;
    protected int hdd;
    protected String os;
    protected String color;

    public Notebook(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
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

    public String getModel() {
        return model;
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


}
