package com.zeta.inheritance;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber,double balance) {
        super(accountNumber,balance); // mandatory to pass the parameters into super class
    }

    private double interestRate = 0.3;
    public SavingsAccount(int accountNumber,double balance,double interestRate) {
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate/100;
        deposit(interest);
        System.out.println("Interest of " + interest + " deposited");
    }
}
