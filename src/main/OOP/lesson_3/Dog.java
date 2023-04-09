package lesson_3;

public class Dog extends Animal{
    public Dog(Integer age, Integer weight, String name) {
        super(age, weight, name);
    }

    @Override
    public String toString() {
        return "Dog{}" + this.getName() + " " + this.getWeight();
    }
}
