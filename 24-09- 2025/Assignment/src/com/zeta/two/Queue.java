package com.zeta.two;

public class Queue {
    int n;
    private boolean isLocked = false;

    public synchronized void depositOperation(BankAccount account, double amount,int n,String name) {
        if (isLocked) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        isLocked = true;
        if(n<=2) {
            account.deposit(amount,name);
        } else {
            System.exit(0);
        }
        isLocked = false;
        notify(); // Release the lock after deposit
    }

    public synchronized void withdrawalOperation(BankAccount account, double amount,String name) {
        if (isLocked) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        isLocked = true;
        if(n<=2) {
            account.withdraw(amount,name);
        } else {
            System.exit(0);
        }
        isLocked = false;
        notify(); // Release the lock after withdrawal
    }
}
