package lesson_3;

public abstract class Animal {
    private Integer age;
    private Integer weight;
    private String name;

    public Animal(Integer age, Integer weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
