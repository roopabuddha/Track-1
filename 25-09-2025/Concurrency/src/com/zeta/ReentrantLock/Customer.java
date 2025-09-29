package com.zeta.ReentrantLock;

public class Customer implements Runnable {
    private BankAccount account;
    private String name;

    public Customer(BankAccount account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        account.withdraw(name,500);
    }


}
