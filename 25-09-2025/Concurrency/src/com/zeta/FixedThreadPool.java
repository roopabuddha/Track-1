package com.zeta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int counter = 0; counter < 10; counter++) {
            final int taskNumber = counter;
            executor.submit(() -> { // a method that recieves a method as an argument pure function
                System.out.println("Task" + taskNumber + " Executed By " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }
}
