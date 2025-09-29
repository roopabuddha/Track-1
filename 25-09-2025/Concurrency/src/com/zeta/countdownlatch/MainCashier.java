package com.zeta.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MainCashier {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread Rupa = new Thread(new Cashier("Rupa", countDownLatch));
        Thread Kiran = new Thread(new Cashier("Kiran", countDownLatch));

        Rupa.start();
        Kiran.start();


        System.out.println("Bank Manger is waiting for all cashiers to finish");

        try {
            countDownLatch.await(); //manager waits until count reaches zero
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Bank Manger is finished");

    }
}
