package com.Inheritance;

public class Cashier extends Employee {
    private float cashierBonus;
    public Cashier(int employeeId, String employeeName, float salary) {
        super(employeeId, employeeName, salary);
        this.cashierBonus = 0;
    }

    public float getCashierBonus() {
        return cashierBonus;
    }

    @Override
    public void calculateBonus() {
        super.calculateBonus();
        cashierBonus = getSalary() * 0.2f;
    }

    @Override
    public void displayEmloyeeDetails() {
        super.displayEmloyeeDetails();
        System.out.println("Cashier Bonus: " + getCashierBonus());
    }
}
