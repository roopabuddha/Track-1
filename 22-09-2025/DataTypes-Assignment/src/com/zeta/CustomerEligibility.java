package com.zeta;

public class CustomerEligibility {
    public static void main(String[] args) {
        double salary = 100000;
        int creditScore = 700;

        if (creditScore > 1000) {
            System.out.println("The credit score is greater than 1000 please provide valid details!");
        }
        else if (salary > 30000 && creditScore >= 700) {
            System.out.println("Congratss!!!! You are eligible for Loan");
        }
        else {
            System.out.println("You are not eligible for Loan! Please Try Again!");
        }

    }
}
