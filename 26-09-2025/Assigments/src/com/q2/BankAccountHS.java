package com.q2;

public class BankAccountHS {
    private int accountNumber;
    private String customerName;
    private double balance;

    public BankAccountHS(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int hashCode() {
        return accountNumber; // unique key = account number
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BankAccountHS)) return false;
        BankAccountHS other = (BankAccountHS) obj;
        return this.accountNumber == other.accountNumber;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber + ", Name: " + customerName + ", Balance: ₹" + balance;
    }
}
