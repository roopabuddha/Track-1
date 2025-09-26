package com.zeta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int counter = 1; counter <=100000; counter++) {
            final int taskNumber = counter;
            executorService.submit(() -> {
                System.out.println("Task" + taskNumber + " Executed By " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    executorService.shutdown();
                }
            });
        }
    }
}
