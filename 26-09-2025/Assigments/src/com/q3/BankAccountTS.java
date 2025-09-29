package com.q3;

public class BankAccountTS {
    private int accountNumber;
    private String customerName;
    private double balance;

    public BankAccountTS(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber + ", Name: " + customerName + ", Balance: ₹" + balance;
    }
}
