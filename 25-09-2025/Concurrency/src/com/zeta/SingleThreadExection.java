package com.zeta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExection {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(); //this used only one thread ot process done sequentially

        for (int counter = 1; counter <= 10; counter++) {
            final int taskId = counter;
            executorService.submit(() -> { //To submit a task (usually a Runnable or Callable) for execution and get a Future object representing the pending result.
                System.out.println("Task " + taskId + " Executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }); //end of lamda and submit
        }

        executorService.shutdown();
    }
}
