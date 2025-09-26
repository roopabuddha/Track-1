package com.zeta.two;

public class Customer2 extends Thread {
    private String customerName;
    private double depositAmount;
    private BankAccount account;
    private Queue queue;

    public Customer2(String customerName, BankAccount account, Queue queue) {
        this.customerName = customerName;
        this.account = account;
        this.queue = queue;
        new Thread(this, "Nesha").start();
    }

    @Override
    public void run() {
        int counter = 1;
        while (true) {
            queue.depositOperation(account, depositAmount,counter++,customerName);
        }
    }

    // Nesha will deposit a fixed amount
    public void setDepositAmount(double amount) {
        this.depositAmount = amount;
    }
}
