package com.zeta;

import java.util.Scanner;

public class BankingMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double accountBalance = 501241;
        boolean flag = true;
       do {
            System.out.println("\n---Bank Menu---");
            System.out.println("1. Check Balance");
           System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Account Balance: " + accountBalance);
                    break;
                case 2:
                    double depositAmount  = sc.nextDouble();
                    accountBalance += depositAmount;
                    System.out.println("Deposit Amount: " + depositAmount + " Successfull");
                case 3:
                    System.out.println("Please enter amount to Withdraw:");
                    double WithdrawAmount = sc.nextDouble();
                    accountBalance = accountBalance - WithdrawAmount;
                    System.out.println("Withdraw Money: " + WithdrawAmount + " Successful");
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        } while (flag);
    }
}
