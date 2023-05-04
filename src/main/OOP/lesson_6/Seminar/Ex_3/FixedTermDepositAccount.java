package lesson_6.Seminar.Ex_3;

public class FixedTermDepositAccount extends Account {
    @Override
    protected void deposit(float amount) {
        //Deposit into this account
    }

    @Override
    protected void withdraw(float amount) {
        throw new UnsupportedOperationException();
    }
}
