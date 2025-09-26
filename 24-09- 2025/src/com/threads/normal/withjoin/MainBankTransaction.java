package com.threads.normal.withjoin;

public class MainBankTransaction {
    public static void main(String[] args) {
        BankTransaction deposit = new BankTransaction("Deposit");
        BankTransaction withdraw = new BankTransaction("Withdrawal");
        BankTransaction balanceEnquiry = new BankTransaction("balanceEnquiry");

        deposit.start();

        try {
            deposit.join();
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }

        withdraw.start();
        try {
            withdraw.join();
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }

        balanceEnquiry.start();
        try {
            balanceEnquiry.join();
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All Transactions Completed.Main Thread Ends");
    }
}
