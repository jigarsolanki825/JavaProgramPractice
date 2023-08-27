package threadex;

import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapOperations implements Serializable {


    private static final HashMap<Integer, Double> bankAccounts = new HashMap<>();
    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        executor.execute(new AddValueThread(1, 1000.0));
        executor.execute(new UpdateValueThread(1, 1500.0));
        executor.execute(new RetrieveValueThread(1));
        //executor.execute(new RetrieveValueThread(2));

        // Shutdown the executor once all tasks are completed
        executor.shutdown();
    }

    static class AddValueThread implements Runnable {
        private final int accountId;
        private final double amount;

        public AddValueThread(int accountId, double amount) {
            this.accountId = accountId;
            this.amount = amount;
        }

        @Override
        public void run() {
            bankAccounts.put(accountId, amount);
            System.out.println("Thread " + Thread.currentThread().getId() + " added amount " + amount + " to account " + accountId);
        }
    }

    static class UpdateValueThread implements Runnable {
        private final int accountId;
        private final double newAmount;

        public UpdateValueThread(int accountId, double newAmount) {
            this.accountId = accountId;
            this.newAmount = newAmount;
        }

        @Override
        public void run() {
            if (bankAccounts.containsKey(accountId)) {
                bankAccounts.put(accountId, newAmount);
                System.out.println("Thread " + Thread.currentThread().getId() + " updated amount for account " + accountId + " to " + newAmount);
            } else {
                System.out.println("Account " + accountId + " not found!");
            }
        }
    }

    static class RetrieveValueThread implements Runnable {
        private final int accountId;

        public RetrieveValueThread(int accountId) {
            this.accountId = accountId;
        }

        @Override
        public void run() {
            if (bankAccounts.containsKey(accountId)) {
                double amount = bankAccounts.get(accountId);
                System.out.println("Thread " + Thread.currentThread().getId() + " retrieved amount " + amount + " for account " + accountId);
            } else {
                System.out.println("Account " + accountId + " not found!");
            }
        }
    }
}