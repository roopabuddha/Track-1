package com.zeta.futureandcallable;

import java.util.concurrent.Callable;

public class MycallableTask  implements Callable<String> {
    private String name;

    public MycallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task " + name + " is running in " + Thread.currentThread().getName());
        Thread.sleep(2000);
        return "Hello from " + name;
    }
}
