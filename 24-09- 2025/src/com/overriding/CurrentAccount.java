package com.overriding;

public class CurrentAccount extends  BankAccount{
    @Override
    public void accountType() {
        System.out.println("This is Current Account");
    }

    @Override // if you give wrong function name it gives runtime error
    public double interestRate() {
        return 0.4f;
    }
}
