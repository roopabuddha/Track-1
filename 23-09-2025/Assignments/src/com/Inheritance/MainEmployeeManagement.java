package com.Inheritance;

public class MainEmployeeManagement {
    public static void main(String[] args) {
        Employee manager = new Manager(123,"Virat kohli",100000);
        manager.calculateBonus();
        manager.displayEmloyeeDetails();

        System.out.println("\n");

        Employee cashier = new Cashier(18,"Rupa",60000);
        cashier.calculateBonus();
        cashier.displayEmloyeeDetails();

        System.out.println("\n");

        Employee salesPerson = new SalesPerson(11,"hello",40000);
        salesPerson.calculateBonus();
        salesPerson.displayEmloyeeDetails();
    }
}
