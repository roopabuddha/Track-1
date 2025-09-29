package com.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankArrayListDemo {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Add sample accounts
        accounts.add(new BankAccount(101, "Virat", 5000));
        accounts.add(new BankAccount(102, "Rupa", 12000));
        accounts.add(new BankAccount(103, "Ganesh", 8000));

        // Display all accounts
        System.out.println("All accounts:");
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }

        // Search accounts with balance more than given amount
        System.out.print("\nEnter minimum balance: ");
        double minBalance = sc.nextDouble();

        System.out.println("Accounts with balance greater than " + minBalance + ":");
        for (BankAccount acc : accounts) {
            if (acc.getBalance() > minBalance) {
                System.out.println(acc);
            }
        }

        sc.close();
    }
}