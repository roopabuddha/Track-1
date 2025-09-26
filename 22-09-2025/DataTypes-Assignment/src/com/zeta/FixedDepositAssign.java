package com.zeta;

public class FixedDepositAssign {
    public static void main(String[] args) {
        double principalAmount = 1000;
        double rateOfInterest  = 0.04;
        double annual = 12;
        double compoundInterest;

        for (int year = 1; year <= 5; year++) {
            double fixedDepositAmount = principalAmount * year;
            double Interest = principalAmount * (1 + rateOfInterest/annual);
            compoundInterest = fixedDepositAmount + Interest;
            System.out.printf("%.2f%n", compoundInterest);
        }
    }
}
