package com.zeta;

public class BankingConditionals {
    public static void main(String[] args) {
        double balance = 5678098.99;
        double withdrawalAmount = 56780;

        if( withdrawalAmount <= balance ) {
            balance -= withdrawalAmount;
            System.out.printf("Withdrawal Successful! of Amount %s%nRemaining Balance :%s%n",withdrawalAmount,balance);
        }

        int accountType = 2;
        switch (accountType) {
            case 1:
                System.out.printf("Saving Account - Min balance Required: %s",1000);
                break;
            case 2:
                System.out.println("Current Account - No Min balance Required");
                break;
            case 3:
                System.out.println("Fixed Deposit - Locked for 1 Year");
                break;
            default:
                System.out.println("Invalid Account Type!");

        }
    }
}
