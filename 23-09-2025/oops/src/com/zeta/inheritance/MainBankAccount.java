package com.zeta.inheritance;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount rupa = new BankAccount(12345,346575);
        System.out.println(rupa.getBalance());
        rupa.withdraw(1000);
        System.out.println(rupa.getBalance());
        rupa.deposit(1000);
        System.out.println(rupa.getBalance());
    }
}
