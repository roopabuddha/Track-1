package com.zeta.semaphore;

import java.util.concurrent.Semaphore;

public class AtmRoom implements Runnable {
    private String name;
    private Semaphore atmSemaphore;

    public AtmRoom(String name, Semaphore atmSemaphore) {
        this.name = name;
        this.atmSemaphore = atmSemaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(name+" is trying to access ATM");
//          acquire permit (if available, otherwise wait)
            atmSemaphore.acquire();
            System.out.println(name+" is using ATM");
            Thread.sleep(2000);
            System.out.println(name+" has finished the transaction and left the ATM");
        } catch (InterruptedException e) {
            atmSemaphore.acquireUninterruptibly();
        } finally {
            atmSemaphore.release();
        }
    }
}
