package com.mycom.withoutYagni;

public class SavingsAccount implements IBankAccount {
    private final String accountNumber;
    private double balance = 0.0;

    public SavingsAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getInterest() {
        return 0;
    }
}
