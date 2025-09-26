package com.zeta.one;

public class Customers extends Thread {
    private final Queueue queue;
    private final String customerName;

    Customers(Queueue queue, String customerName) {
        this.queue = queue;
        this.customerName = customerName;
        new Thread(this, customerName).start();
    }

    public void run() {
        int counter = 1;
        while (true) {
            queue.checkIn(customerName,counter++);  // Try to check in
        }
    }
}