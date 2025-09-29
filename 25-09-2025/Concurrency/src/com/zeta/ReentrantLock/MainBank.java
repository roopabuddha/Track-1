package com.zeta.ReentrantLock;

public class MainBank {
    public static void main(String[] args) {
        BankAccount  account = new BankAccount(10000);

        Thread Rupa =  new Thread(new Customer(account,"Customer-1 - Rupa"));
        Thread Uday =  new Thread(new Customer(account,"Customer-3 - Uday"));
        Thread Ganesh =  new Thread(new Customer(account,"Customer-4 - Ganesh"));

        //All four customers are anticipating this balance is 1000, without knowing other customers are also trying to withdraw ensures perfect banking transaction

        Rupa.start();
        Uday.start();
        Ganesh.start();


    }
}
