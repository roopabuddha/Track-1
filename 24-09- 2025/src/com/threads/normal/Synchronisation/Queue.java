package com.threads.normal.Synchronisation;

public class Queue {
    int n;
    boolean isLocked = false;

    public synchronized void put(int n) {
        if (isLocked)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        this.n = n;
        isLocked = true;
        if (n<=6)
            System.out.println("Producer Manufactured product : " + n);
        else System.exit(0);
        notify(); //lock is released
    }

    public synchronized int get() {
        if (!isLocked)
            try {
                wait();
            }  catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        if (n<=5)
            System.out.println("Consumer Manufactured consumer : " + n);
        else System.exit(0);

        isLocked = false;
        notify();
        return n;
    }
}




