package assignment;

import java.util.Random;
import java.util.concurrent.*;

import static assignment.TransactionSimulator.random;

public class TransactionSimulator {
    static final Random random = new Random();
    private static final int NUM_ACCOUNTS = 5;
    private static final int NUM_TRANSACTIONS = 1000;
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        // Create accounts
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
        for (int i = 0; i < NUM_ACCOUNTS; i++) {
            accounts[i] = new BankAccount("ACC" + (i+1), "User" + (i+1), 1000.0);
        }

        // Simulate transactions
        for (int i = 0; i < NUM_TRANSACTIONS; i++) {
            executor.submit(new TransactionTask(accounts));
        }

        // Shut down the executor after all transactions are completed
        executor.shutdown();
    }
}