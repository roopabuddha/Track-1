package com.zeta;

public class SavingBankAccount {
    private int accountNumber;
    private double balance;

    public SavingBankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The Remaining Balance is " + getBalance() + " for account number " + getAccountNumber();
    }
}
