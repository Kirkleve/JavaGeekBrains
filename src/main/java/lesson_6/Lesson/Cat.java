package lesson_6.Lesson;

/*1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачев
Можно записать в текстовом виде, необязательно реализовывать в java.
 */

import java.util.*;

public class Cat implements Comparable<Cat> {

    private int id;
    private int age;
    private int weight;
    private String name;
    private String breed;
    private String color;

    public Cat(int id, int age, int weight, String name, String breed, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat(String name) {
        this(0, 0, 0, name, null, null);
    }

    public Cat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.id, o.id);
    }

    public static void main(String[] args) {
        Set<Cat> hashCats = new HashSet<>();
        hashCats.add(new Cat(1, "Barsik"));
        hashCats.add(new Cat(2, "Kedi"));
        hashCats.add(new Cat(3, "Mailo"));
        hashCats.add(new Cat(4, "Smurf"));
        hashCats.add(new Cat(5, 12, 13, "Barsik", "siam", "Gray"));
        hashCats.add(new Cat(6, 4, 7, "Barsik", "siam", "Black"));
        for (Cat cat : hashCats) {
            System.out.println(cat);
        }
        System.out.println();
        Set<Cat> treeCats = new TreeSet<>(hashCats);
        treeCats.add(new Cat(7, 6, 9, "Barsik", "siam", "White"));
        treeCats.add(new Cat(8, 3, 5, "Rsik", "siam", "Green"));
        treeCats.add(new Cat(9, 8, 7, "Bar", "siam", "Broun"));
        for (Cat cat : treeCats) {
            System.out.println(cat);
        }
    }
}
