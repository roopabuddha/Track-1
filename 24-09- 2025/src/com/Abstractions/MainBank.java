package com.Abstractions;

import com.overriding.BankAccount;
import com.overriding.SavingsAccount;

public class MainBank {
    public static void main(String[] args) {
        BankAccounts acc1 = new SavingsAccounts(123,60000,0.03);
        BankAccounts acc2 = new SavingsAccounts(124,40000,0.04);

        acc1.withdraw(1000);
        acc1.withdraw(11000);
        acc1.displayAccountType();

    }
}
