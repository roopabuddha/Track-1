package com.zeta.predconssupl.predicate;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<Double> highBalance = balance-> balance > 10000.00;
        System.out.println("is Balance > 10000.00" + highBalance.test(55000.00));
        System.out.println("is Balance > 10000.00" + highBalance.test(1500.00));

    }
}
