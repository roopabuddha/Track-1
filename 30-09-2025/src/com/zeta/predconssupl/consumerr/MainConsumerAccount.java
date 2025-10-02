package com.zeta.predconssupl.consumerr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainConsumerAccount {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = Arrays.asList(
                new  BankAccount("AC123",8000),
                new  BankAccount("AC124",10000),
                new  BankAccount("AC125",12000));

        Consumer<BankAccount> printAccount = bankAccount -> {
            System.out.println("Account number: " + bankAccount.getAccountNumber() + " balance: " + bankAccount.getBalance());
        };
        bankAccounts.forEach(printAccount);
        System.out.println("With Balance Details...!");
        Consumer<BankAccount> printBal = bankAccount -> {
            System.out.println("Balance of " + bankAccount.getAccountNumber() + " is " + bankAccount.getBalance());
        };
        Consumer<BankAccount> combined = printAccount.andThen(printBal);
        bankAccounts.forEach(combined);
    }
}
