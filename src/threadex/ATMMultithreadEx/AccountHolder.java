package threadex.ATMMultithreadEx;

public class AccountHolder implements Runnable{

    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=1;i<=4;i++){

            makeWithdrawal(2000.00);
            if(account.getBalance()<0){
                System.out.println("Account is overdrawn");
            }
        }
    }

    public synchronized void makeWithdrawal(double withdrawalAmount){
        if (account.getBalance()>=withdrawalAmount){
            System.out.println(Thread.currentThread().getName() + " is going to withdraw : "+withdrawalAmount);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            account.withdraw(withdrawalAmount);

            System.out.println(Thread.currentThread().getName() +" is completed withdrawal of : "+withdrawalAmount);
            System.out.println("Now current balance is : "+account.getBalance());
        }
        else {
            System.out.println("Not enough money in account for "+ Thread.currentThread().getName() + " to withdraw "+ withdrawalAmount);
        }
    }
}
