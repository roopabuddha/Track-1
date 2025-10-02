package com.zeta.predconssupl.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainBankAccount {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("123",6000,"Current"),
         new BankAccount("124",500,"Savings")
        );
        Predicate<BankAccount> isSavings = b -> b.getBalance() < 1000 && b.getAccountType().equals("Savings");
        Predicate<BankAccount> highbalance = b -> b.getBalance() > 1000;

        Predicate<BankAccount> richSavings = highbalance.and(isSavings);

        System.out.println("Accounts with balance > 10000 and types savings");
        accounts.stream().filter(richSavings).forEach(System.out::println);

    }
}
