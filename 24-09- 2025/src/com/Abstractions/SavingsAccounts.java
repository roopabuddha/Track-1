package com.Abstractions;

import java.sql.SQLOutput;

public class SavingsAccounts extends BankAccounts {
    private double interestRate;

    public SavingsAccounts(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.printf("Withdrawal of amount %s is Successful Remaining Balance: %s%n",amount,getBalance());
        }
    }

    @Override
    public void displayAccountType() {
        double interest = getBalance() * interestRate;
        System.out.println("Interest Rate: " + interest);
    }
}
