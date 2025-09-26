package com.zeta.futureandcallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureInterface {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> future = executorService.submit(new MycallableTask("Task1"));
        Future<String> future2 = executorService.submit(new MycallableTask("Task2"));

        System.out.println("Main thread is doing another work.......");

        System.out.println("Is task Done? " + future.isDone());

        System.out.println("Is task Done? " + future2.isDone());

        String result = future.get();
        System.out.println(result);

        String result2 = future2.get();
        System.out.println(result2);


        System.out.println("Is task Done Now? " + future.isDone());
        System.out.println("Is task Done Now? " + future2.isDone());

        executorService.shutdown();

    }
}
