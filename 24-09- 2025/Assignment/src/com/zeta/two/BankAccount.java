package com.zeta.two;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount,String customerName) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(customerName+ " have successfully Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

    public synchronized void deposit(double amount,String customerName) {
        balance += amount;
        System.out.println(customerName+ " have successfully deposited: " + amount + " | New Balance: " + balance);
    }
}
