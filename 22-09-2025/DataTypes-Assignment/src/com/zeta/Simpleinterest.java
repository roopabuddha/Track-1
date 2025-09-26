package com.zeta;

public class Simpleinterest {
    public static void main(String[] args) {
        double principalAmount = 1000;
        double rateOfInterest = 3;
        int timePeriod = 8;

        double simpleInterest;

        simpleInterest = (principalAmount*rateOfInterest*timePeriod) / 100;

        System.out.println("The total amount after Simple Interest is: " + (simpleInterest+principalAmount));

    }
}