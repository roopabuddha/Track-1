package com.zeta;

import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {

        SavingBankAccount savingBankAccount[] = new SavingBankAccount[5];
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < savingBankAccount.length; index++) {
            int actno;
            float balance;
            System.out.println("Please enter the account number and Balance:");
            actno = sc.nextInt();
            balance = sc.nextFloat();

            savingBankAccount[index] = new SavingBankAccount(actno,balance);
        }
        for (int index = 0; index < savingBankAccount.length; index++) {
            System.out.println(savingBankAccount[index].getAccountNumber());
            System.out.println(savingBankAccount[index].getBalance());
            System.out.println(savingBankAccount[index]);
        }
    }
}
