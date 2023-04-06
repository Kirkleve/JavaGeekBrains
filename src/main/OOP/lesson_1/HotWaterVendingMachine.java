package lesson_1;

import java.util.List;

public class HotWaterVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotWater getProduct(String name, double volume) throws IllegalStateException{
        for (Product product : products) {
            if (product instanceof HotWater) {
                if (product.getName().equalsIgnoreCase(name) && ((HotWater) product).getVolume() == volume) {
                    return (HotWater) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotWater getProduct(String name, double volume, int temperature) throws IllegalStateException{
        for (Product product : products) {
            if (product instanceof HotWater) {
                if (product.getName().equalsIgnoreCase(name) && ((HotWater) product).getVolume() == volume && ((HotWater) product).getTemperature() == temperature) {
                    return (HotWater) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
