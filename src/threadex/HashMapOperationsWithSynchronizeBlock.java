package threadex;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperationsWithSynchronizeBlock {
    private static final Map<Integer, Double> bankAccounts = new HashMap<>();


    public static void main(String[] args) throws InterruptedException {
        Thread addThread = new Thread(() -> addValue(1, 1000.0));
        Thread updateThread = new Thread(() -> updateValue(1, 1500.0));
        Thread retrieveThread = new Thread(() -> retrieveValue(1));

        // Start the threads
        addThread.start();
        updateThread.start();
        retrieveThread.start();

    }

    public static void retrieveValue(int accountId) {
        synchronized (bankAccounts) {
            if (bankAccounts.containsKey(accountId)) {
                double amount = bankAccounts.get(accountId);
                System.out.println("Retrieved amount " + amount + " for account " + accountId);
            } else {
                System.out.println("Account " + accountId + " not found!");
            }
        }
    }
    public static void addValue(int accountId, double amount) {
        synchronized (bankAccounts) {
            bankAccounts.put(accountId, amount);
            System.out.println("Added amount " + amount + " to account " + accountId);
        }
    }


    public static void updateValue(int accountId, double newAmount) {
        synchronized (bankAccounts) {
            if (bankAccounts.containsKey(accountId)) {
                bankAccounts.put(accountId, newAmount);
                System.out.println("Updated amount for account " + accountId + " to " + newAmount);
            } else {
                System.out.println("Account " + accountId + " not found!");
            }
        }
    }


}
