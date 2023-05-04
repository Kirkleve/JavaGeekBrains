package lesson_6.Seminar.Ex_3;

public class NewClass extends Account {
    @Override
    protected void deposit(float amount) {
        this.balance += amount;
    }

    @Override
    protected void withdraw(float amount) {
        this.balance -= amount;
    }
}
