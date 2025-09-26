package com.zeta.two;

public class Customer1 extends Thread {
    private String customerName;
    private double withdrawalAmount;
    private BankAccount account;
    private Queue queue;

    public Customer1(String customerName, BankAccount account, Queue queue) {
        this.customerName = customerName;
        this.account = account;
        this.queue = queue;
        new Thread(this, "Fedrick").start();
    }

    @Override
    public void run() {
        while (true) {
            queue.withdrawalOperation(account, withdrawalAmount,customerName);
        }
    }

    // Fedrick will withdraw a fixed amount
    public void setWithdrawalAmount(double amount) {
        this.withdrawalAmount = amount;
    }
}
