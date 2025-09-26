package com.zeta.lambda;

public class MainUsingLambda {
    public static void main(String[] args) {
        Message msg1 = () -> System.out.println("Hello World!");
        Message msg2 = () -> System.out.println("Hello Rupa!");
        msg1.printMessage();
        msg2.printMessage();
    }
}
