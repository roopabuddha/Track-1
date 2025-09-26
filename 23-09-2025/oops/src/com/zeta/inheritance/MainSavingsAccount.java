package com.zeta.inheritance;

public class MainSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount savingAcc = new SavingsAccount(12345, 400000);
        System.out.println(savingAcc.getBalance());
        savingAcc.addInterest();
        System.out.println(savingAcc.getBalance());
    }
}
