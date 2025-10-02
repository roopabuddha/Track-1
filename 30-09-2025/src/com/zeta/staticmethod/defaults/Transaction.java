package com.zeta.staticmethod.defaults;

import java.util.concurrent.atomic.AtomicReference;

public interface Transaction {
    void execute(double amount);
    static boolean validateAmount(double amount) {
        return amount > 0;
    }
    default void printReceipt(String transactionType, double amount, AtomicReference<String> stateOfTransaction) {
        System.out.println("-----RECEIPT-----");
        System.out.println("TransactionType: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Status: "+ stateOfTransaction);
        System.out.println("----------\n");
    }
}
