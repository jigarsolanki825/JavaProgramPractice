package threadex.ATMMultithreadEx;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){

    }

    public Account(double balance) {
        System.out.println("Bank balance is : "+balance);
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
