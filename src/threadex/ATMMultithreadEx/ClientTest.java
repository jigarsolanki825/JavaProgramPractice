package threadex.ATMMultithreadEx;

public class ClientTest {
    public static void main(String[] args) {

        Account account =new Account(8000.00);


        AccountHolder accountHolder = new AccountHolder(account);
        Thread t1 =new Thread(accountHolder);
        Thread t2 =new Thread(accountHolder);

        t1.setName("Jack");
        t2.setName("Jigar");

        t1.start();
        t2.start();

    }
}
