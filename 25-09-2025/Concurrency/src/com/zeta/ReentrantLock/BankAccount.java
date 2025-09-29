package com.zeta.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(String customer, double amount) {
        lock.lock();

        try {
            System.out.println("Withdrawing " + customer + " " + amount);

            if (balance >= amount) {
                System.out.println("Withdrawn " + customer + " " + amount);
                balance -= amount;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }  else  {
                System.out.println("Insufficient funds");
            }
        } finally {
            lock.unlock();
        }
    }
}
