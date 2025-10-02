package com.zeta.staticmethod.logging;

public interface Transaction {
    void execute(double amount);
    static void log(String message) {
        System.out.println("[Transaction] " + message);
    }
}
