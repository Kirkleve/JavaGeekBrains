package lesson_3;

public class Cat extends Animal{

    public Cat(Integer age, Integer weight, String name) {
        super(age, weight, name);
    }

    @Override
    public String toString() {
        return "Cat{}" + this.getName() + " " + this.getWeight();
    }
}
