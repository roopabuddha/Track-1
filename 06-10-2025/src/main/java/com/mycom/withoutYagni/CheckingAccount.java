package com.mycom.withoutYagni;

public class CheckingAccount implements IBankAccount {
    private String accountNumber;
    private double balance;

    public CheckingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }
    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        balance += amount;
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public double getInterest() {
        return 0.0;
    }
}
