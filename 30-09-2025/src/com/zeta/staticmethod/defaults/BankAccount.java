package com.zeta.staticmethod.defaults;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount + " Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolder + " withdraw " + amount + " Current balance: " + balance);
        } else {
            System.out.println(accountHolder + "Insufficient Funds");
        }
    }
}
