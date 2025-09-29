package com.zeta.lambda.functionalinterface;

@FunctionalInterface
public interface Transaction {
    void execute(double amount);
}
