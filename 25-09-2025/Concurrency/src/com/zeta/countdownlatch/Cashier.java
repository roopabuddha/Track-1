package com.zeta.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Cashier implements Runnable {
    private String name;
    private CountDownLatch countDownLatch;

    public Cashier(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " finishing daily transactions");
            Thread.sleep(2000);
            System.out.println(name + " has finishd");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            countDownLatch.countDown(); //decrease the thread count
        }
    }
}
