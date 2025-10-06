package com.mycom.withoutYagni;

public interface IBankAccount {
    String getAccountNumber();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    double getInterest();
}
