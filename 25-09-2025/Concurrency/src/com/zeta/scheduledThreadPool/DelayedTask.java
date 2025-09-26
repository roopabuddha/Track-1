package com.zeta.scheduledThreadPool;

public class DelayedTask implements Runnable {
    @Override
    public void run() {
        for (int counter = 0; counter < 5; counter++) {
            System.out.println("DelayedTask " +counter +" is running by " + Thread.currentThread().getName());
        }
        for (int counter = 6; counter < 10 ; counter++) {
            System.out.println("DelayedTask " +counter +" is running by " + Thread.currentThread().getName());
        }
    }
}
