package src;

public class GareebBank implements BankingSystem {
    int balance =0;
    int accNo;
    String name;
    double interestRate;

    public GareebBank(int balance, int accNo, String name, double interestRate) {
        this.balance = balance;
        this.accNo = accNo;
        this.name = name;
        this.interestRate = interestRate;
    }

    @Override
    public void AccBalance() {
        System.out.println("balance is" + balance);
    }

    @Override
    public void WithdrawMoney(int fund) {

     if(balance < fund){
         System.out.println("you are greeb");
         balance = balance +fund;
     }
     else{
         System.out.println("withdrawal " + fund + "from acc " + accNo + "avilable balance = " + balance);
     }
    }

    @Override
    public void deposit(int money) {
        balance += money;
        System.out.println(money + " Deposited to your acc" + accNo + "avilable balance is" +balance);

    }

    @Override
    public void calculateEMI(int balance) {


    }


}
