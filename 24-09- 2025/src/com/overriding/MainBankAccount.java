package com.overriding;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount();
        BankAccount bankAccount2 = new CurrentAccount(); //Super class reference and subclass object

        bankAccount.accountType();
        System.out.println("And the Interest Rate is :" + bankAccount.interestRate());

        bankAccount2.accountType();
        System.out.println("And the Interest Rate is :" + bankAccount2.interestRate());
    }
}


//                                object
//                    |______________|________________|
//                savings account             current account
//                                                    |
//                                            cooperate current count
// for all classes we will be taking only one main object as bank account and will be declaring subclasses with reference to main object