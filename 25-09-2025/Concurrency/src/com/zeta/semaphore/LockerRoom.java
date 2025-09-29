package com.zeta.semaphore;

import java.util.concurrent.Semaphore;

public class LockerRoom implements Runnable {
    String name;
    Semaphore semaphore;


    public LockerRoom(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " Trying to acquire semaphore for room ");
            semaphore.acquire();
            System.out.println(name + " Acquired semaphore for room ");
        } catch (InterruptedException e) {
            semaphore.acquireUninterruptibly();
        } finally {
            semaphore.release();
            System.out.println(name + " Released semaphore for room ");
        }
    }
}
