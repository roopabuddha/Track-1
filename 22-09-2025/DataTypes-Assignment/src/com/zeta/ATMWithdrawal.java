package com.zeta;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double accountBalance = 501241;
        boolean flag = true;
        while (flag) {
            System.out.println("\n---Bank Menu---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Account Balance: " + accountBalance);
                    break;
                case 2:
                    System.out.println("Please enter amount to Withdraw:");
                    double amount = sc.nextDouble();
                    accountBalance = accountBalance - amount;
                    System.out.println("Withdraw Money: " + amount + " Successful");
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
