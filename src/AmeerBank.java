package src;

public class AmeerBank implements BankingSystem {
    int accountNo;
    String Name;
    String PAN;
    int balance;
    int year;
    int InterestRate = 10;

    public AmeerBank(int accountNo, String name, String PAN, int balance, int year, int interestRate) {
        this.accountNo = accountNo;
        Name = name;
        this.PAN = PAN;
        this.balance = balance;
        this.year = year;
        InterestRate = interestRate;
    }

    @Override
    public void AccBalance() {

    }

    @Override
    public void WithdrawMoney(int money) {

    }

    @Override
    public void deposit(int money) {

    }

    @Override
    public void calculateEMI(int balance) {

    }
}
