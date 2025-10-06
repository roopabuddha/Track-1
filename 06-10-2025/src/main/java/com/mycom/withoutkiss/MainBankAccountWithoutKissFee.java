package com.mycom.withoutkiss;

public class MainBankAccountWithoutKissFee {
    public static void main(String[] args) {
        System.out.println("--Starting Bank Account Application");

        BasicMonthlyFeeSalary basicMonthlyFeeSalary = new BasicMonthlyFeeSalary();
        BankAccountWithFee account1 = new BankAccountWithFee(250.00,basicMonthlyFeeSalary);
        System.out.println("\nAccount 1 created with balance: $");
        account1.applyMonthlyFee();

        System.out.println("Applying monthly fee to Account 1..");
        account1.applyMonthlyFee();

        System.out.println("New balance after fee: $");
        account1.applyMonthlyFee();



        BankAccountWithFee account2 = new BankAccountWithFee(1200.00,basicMonthlyFeeSalary);
        System.out.println("Account 2 created with balance: $");

        System.out.println("Applying monthly fee to Account 1..");
        account2.applyMonthlyFee();

        System.out.println("New balance after fee: $");


        System.out.println("\n----Thank you for using Application-----");



    }
}
