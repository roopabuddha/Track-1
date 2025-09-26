package com.overriding;

public class SavingsAccount extends BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is Savings Account");
    }

    @Override
    public double interestRate() {
        return 0.3f;
    }
}
