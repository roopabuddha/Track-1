package com.mycom.withkiss;


public class MainBankAccountWithKissFee {
    public static void main(String[] args) {
        BankAccountWithFee  account1 = new BankAccountWithFee(10000.00f);
        System.out.println("\nAccount 1 created with balance:$"+ account1.getBalance());

        System.out.println("Applying monthly fee to Account 1....");
        account1.applyMonthlyFee();
        System.out.println("New Balance after:$" + account1.getBalance());

        BankAccountWithFee account2 = new BankAccountWithFee(12000.00f);
        System.out.println("\nAccount 2 created with balance:$"+ account2.getBalance());

        System.out.println("Applying monthly fee to Account 2....");
        account2.applyMonthlyFee();
        System.out.println("New Balance after:$" + account2.getBalance());

        System.out.println("\n---Thank you for using our Application");

    }
}
