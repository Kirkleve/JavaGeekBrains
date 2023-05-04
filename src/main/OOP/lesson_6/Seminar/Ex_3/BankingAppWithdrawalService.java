package lesson_6.Seminar.Ex_3;

public class BankingAppWithdrawalService {
    private final NewClass account;

    public BankingAppWithdrawalService(NewClass account) {
        this.account = account;
    }

    public void withdraw(float amount) {
        account.withdraw(amount);
    }
}
