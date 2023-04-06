package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> bottleOfWater = new ArrayList<>();
        bottleOfWater.add(new BottleOfWater("BonAqua", 80.0, 0.5));
        bottleOfWater.add(new BottleOfWater("Sovlit", 50.0, 0.5));
        bottleOfWater.add(new BottleOfWater("Aqua", 70.0, 0.5));
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(bottleOfWater);

        System.out.println(machine.getProduct("Aqua"));
        System.out.println(machine.getProduct("Aqua", 0.5));

        List<Product> hotWater = new ArrayList<>();
        hotWater.add(new HotWater("tea", 90.0, 0.5, 45));
        hotWater.add(new HotWater("tea", 90.0, 0.5, 65));
        hotWater.add(new HotWater("coffee", 100.0, 0.3, 35));
        hotWater.add(new HotWater("coffee", 120.0, 0.4, 35));
        hotWater.add(new HotWater("coffee", 120.0, 0.5, 35));
        hotWater.add(new HotWater("hot chocolate", 70.0, 0.5, 40));
        HotWaterVendingMachine hotMachine = new HotWaterVendingMachine(hotWater);

        System.out.println(hotMachine.getProduct("hot chocolate"));
        System.out.println(hotMachine.getProduct("coffee", 0.4));
        System.out.println(hotMachine.getProduct("tea", 0.5, 65));
    }
}
