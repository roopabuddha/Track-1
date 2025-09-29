package com.zeta.volatiles;

public class BankServer extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        System.out.println("BankServer started");
        while (running) {
            try {
                Thread.sleep(1000);
                System.out.println("Processing banking transaction");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BankServer stopped");
    }
    public void shutdown() {
        running = false;
    }
}
