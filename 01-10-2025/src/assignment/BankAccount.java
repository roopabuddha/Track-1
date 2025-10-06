package assignment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class BankAccount {
    private static final Logger logger = Logger.getLogger(BankAccount.class.getName());

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private final Lock lock = new ReentrantLock();  // Using ReentrantLock for thread-safety

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        lock.lock();
        try {
            balance += amount;
            logger.info(Thread.currentThread().getName() + " deposited " + amount + " to account " + accountNumber);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        lock.lock();
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
            }
            balance -= amount;
            logger.info(Thread.currentThread().getName() + " withdrew " + amount + " from account " + accountNumber);
        } finally {
            lock.unlock();
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (this == toAccount) {
            throw new IllegalArgumentException("Cannot transfer to the same account.");
        }

        lock.lock();
        try {
            withdraw(amount);  // Withdraw from current account
            toAccount.deposit(amount);  // Deposit to the target account
            logger.info(Thread.currentThread().getName() + " transferred " + amount + " from account " + accountNumber + " to account " + toAccount.getAccountNumber());
        } catch (InsufficientFundsException e) {
            logger.severe(Thread.currentThread().getName() + " failed to transfer due to insufficient funds.");
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}