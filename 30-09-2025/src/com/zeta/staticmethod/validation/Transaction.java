package com.zeta.staticmethod.validation;

public interface Transaction {
    void execute(double amount);
    static boolean validateAmount(double amount) {
        return amount > 0;
    }
}
