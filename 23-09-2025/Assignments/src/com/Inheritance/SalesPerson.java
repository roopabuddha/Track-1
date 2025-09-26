package com.Inheritance;

public class SalesPerson extends Employee {
    private float salesPersonBonus;

    public SalesPerson(int employeeId, String employeeName, float salary) {
        super(employeeId, employeeName, salary);
        this.salesPersonBonus = salesPersonBonus;
    }

    public float getSalesPersonBonus() {
        return salesPersonBonus;
    }

    public void setSalesPersonBonus(float salesPersonBonus) {
        this.salesPersonBonus = salesPersonBonus;
    }

    @Override
    public void calculateBonus() {
        super.calculateBonus();
        salesPersonBonus = getSalary() * 0.15f;
    }

    @Override
    public void displayEmloyeeDetails() {
        super.displayEmloyeeDetails();
        System.out.println("Sales Person Bonus: " + salesPersonBonus);
    }
}
