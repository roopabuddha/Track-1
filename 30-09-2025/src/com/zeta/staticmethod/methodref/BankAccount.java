package com.zeta.staticmethod.methodref;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit() {
        balance += 1000;
        System.out.println(accountHolder + "Deposited 1000 " + balance);
    }

    public void withdraw() {
        balance -= 1000;
        System.out.println(accountHolder + "Withdraw 1000 " + balance);
    }

    public void printAccountHolder() {
        System.out.println("Account Holder:" + accountHolder);
    }

    public static void bankGreeting() {
        System.out.println("Welcome to the Trust Bank!");
    }
}
