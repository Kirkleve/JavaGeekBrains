package lesson_1;

public class BottleOfWater extends Product {
    private Double volume;


    public BottleOfWater(String name, double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
               "name='" + super.getName() + '\'' +
               "volume='" + this.volume + '\'' +
               ", cost=" + super.getCost() +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleOfWater)) {
            return false;
        }

        BottleOfWater that = (BottleOfWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
               && super.getCost() == that.getCost()
               && getVolume().equals(that.getVolume());
    }
}
