package com.zeta.lambda;

public class HelloWorldRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello World!");
        runnable.run();
    }

}
