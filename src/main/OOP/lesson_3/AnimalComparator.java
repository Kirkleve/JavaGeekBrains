package lesson_3;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    private String type;

    public AnimalComparator(String type) {
        this.type = type;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        switch (type){
            case "weight": {
                return o1.getWeight().compareTo(o2.getWeight());
            }
            case "age": {
                return o1.getAge().compareTo(o2.getAge());
            }
        }
        return 0;
    }
}
