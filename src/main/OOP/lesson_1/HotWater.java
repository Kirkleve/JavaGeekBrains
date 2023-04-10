package lesson_1;

public class HotWater extends BottleOfWater {
    private int temperature;

    public HotWater(String name, double cost, Double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.getName() + ' '
                + super.getVolume() + "л., "
                + super.getCost() + "руб., t = "
                + temperature + "°C";
    }
}
