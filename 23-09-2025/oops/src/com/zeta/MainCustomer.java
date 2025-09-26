package com.zeta;

import com.zeta.inheritance.SavingsAccount;

public class MainCustomer {
    public static void main(String[] args) {
        Customer rupa =new Customer(18,"Roopa Kiran",18000);
        Customer virat =new Customer(18,"Roopa Kiran",18000);
        rupa.showDetails();
        System.out.println(Customer.tollFreeNumber); //using class name
        System.out.println(rupa.tollFreeNumber);
        virat.showDetails();
        System.out.println(virat.tollFreeNumber);
        System.out.println(virat.toString());
    }
}
