package com.q3;

import java.util.Comparator;
import java.util.TreeSet;

public class BankTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<BankAccountTS> accounts = new TreeSet<>(Comparator.comparing(BankAccountTS::getCustomerName));

        accounts.add(new BankAccountTS(101, "Rupa", 7000));
        accounts.add(new BankAccountTS(102, "Kiran", 9000));
        accounts.add(new BankAccountTS(103, "Buddha", 11000));

        System.out.println("All Accounts in TreeSet: "); // Sorted by name
        for (BankAccountTS acc : accounts) {
            System.out.println(acc);
        }

        // First and last customer alphabetically
        System.out.println("\nFirst customer: " + accounts.first());
        System.out.println("Last customer: " + accounts.last());


        // Check if a customer exists
        boolean exists = accounts.stream().anyMatch(acc -> acc.getCustomerName().equals("Rupa"));
        System.out.println("\nDoes Rupa exist? " + (exists ? "Yes" : "No"));
    }
}