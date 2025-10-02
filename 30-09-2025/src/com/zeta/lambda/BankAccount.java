package com.zeta.lambda;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount + " Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolder + " withdrawn " + amount + " Current Balance: " + balance);
        }  else {
            System.out.println(accountHolder + " Insufficient Balance" + amount);
        }
    }
}
