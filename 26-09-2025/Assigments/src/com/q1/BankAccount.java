package com.q1;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;
    public BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    @Override
    public String toString() {
        return "Account No: " + accountNumber + ", Name: " + customerName + ", Balance: ₹" + balance;
    }
}