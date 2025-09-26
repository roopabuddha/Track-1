package com.threads.normal.withjoin;

public class BankTransaction extends Thread {
    private String transactionName;

    public BankTransaction(String transactionName) {
        this.transactionName = transactionName;
    }

    @Override
    public void run() {
        System.out.println(transactionName+" Started....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(transactionName+" Completed....");
    }
}
