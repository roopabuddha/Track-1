package com.zeta.volatiles;

public class MainVolatile {
    public static void main(String[] args) throws InterruptedException {
        BankServer bankServer = new BankServer();

        bankServer.start();
        Thread.sleep(5000);
        System.out.println("Admin sending shutdown signal.....");
        bankServer.shutdown();
    }
}
