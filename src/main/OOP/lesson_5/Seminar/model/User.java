package lesson_5.Seminar.model;

public class User {
    private Integer userID = 0;
    private String name;
    private int age;
    private int cash;

    public User(String name, int age, int cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "№" + userID +
                " name='" + name + '\'' +
                ", age=" + age +
                ", cash=" + cash + "$";
    }
}
