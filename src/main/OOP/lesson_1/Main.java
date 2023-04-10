package lesson_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> bottleOfWater = new ArrayList<>();
        bottleOfWater.add(new BottleOfWater("BonAqua", 80.0, 0.5));
        bottleOfWater.add(new BottleOfWater("Sovlit", 50.0, 0.5));
        bottleOfWater.add(new BottleOfWater("Aqua", 70.0, 0.5));
        BottleOfWaterVendingMachine waterMachine = new BottleOfWaterVendingMachine(bottleOfWater);

        System.out.println(waterMachine.getProduct("Sovlit"));
        System.out.println(waterMachine.getProduct("Aqua", 0.5));
        System.out.println();

        List<Product> hotWater = new ArrayList<>();

        hotWater.add(new HotWater("tea", 90.0, 0.5, 45));
        hotWater.add(new HotWater("tea", 90.0, 0.5, 65));
        hotWater.add(new HotWater("coffee", 100.0, 0.3, 35));
        hotWater.add(new HotWater("coffee", 120.0, 0.4, 35));
        hotWater.add(new HotWater("coffee", 120.0, 0.5, 35));
        hotWater.add(new HotWater("hot chocolate", 70.0, 0.5, 40));

        HotWaterVendingMachine hotWaterMachine = new HotWaterVendingMachine(hotWater);
        ProductIterator machineIterator = new ProductIterator(bottleOfWater,5);
        while (machineIterator.hasNext()){
            System.out.println(machineIterator.next().getName());
        }
        System.out.println();

        System.out.println(hotWaterMachine.getProduct("hot chocolate"));
        System.out.println(hotWaterMachine.getProduct("coffee", 0.4));
        System.out.println(hotWaterMachine.getProduct("tea", 0.5, 65));
        System.out.println();

        System.out.println(waterMachine);
        ProductComparator comparator = new ProductComparator();
        bottleOfWater.sort(comparator);
        System.out.println(waterMachine);
        bottleOfWater.sort(comparator.reversed());
        System.out.println(waterMachine);
    }
}
