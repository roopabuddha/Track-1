package com.zeta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskProcessingSystem {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int counter = 1; counter <= 5; counter++) {
            final int finalCounter = counter;
            executor.submit(() -> {
                System.out.println("Task" + finalCounter + " Executed By " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();

    }
}
