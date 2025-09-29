package com.q2;

import java.util.HashSet;

public class BankHashSetDemo {
    public static void main(String[] args) {
        HashSet<BankAccountHS> accounts = new HashSet<>();

        accounts.add(new BankAccountHS(101, "Rupa", 5000));
        accounts.add(new BankAccountHS(102, "Uday", 12000));
        accounts.add(new BankAccountHS(101, "Ganesh", 6000)); // duplicate ignored

        System.out.println("All Accounts in HashSet:");
        for (BankAccountHS acc : accounts) {
            System.out.println(acc);
        }

        // Remove an account
        accounts.remove(new BankAccountHS(101, "Uday", 5000));
        System.out.println("\nAfter removing account 101:");
        for (BankAccountHS acc : accounts) {
            System.out.println(acc);
        }
    }
}