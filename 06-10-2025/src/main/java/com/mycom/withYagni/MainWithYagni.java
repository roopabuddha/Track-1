package com.mycom.withYagni;

public class MainWithYagni {
    public static void main(String[] args) {
        final String accountNumber;
        double balance = 0.0;

        SavingsAccount savingsAccount = new SavingsAccount("MBNK3456789");


        accountNumber = savingsAccount.getAccountNumber();
        balance = savingsAccount.getBalance();
        System.out.println("Balance: " + balance);

        savingsAccount.deposit(10000);
        balance = savingsAccount.getBalance();
        System.out.println("Balance: " + balance);


        savingsAccount.withdraw(10000);
        balance = savingsAccount.getBalance();
        System.out.println("Balance: " + balance);
    }
}
