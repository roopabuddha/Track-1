package com.Inheritance;

public class Manager extends Employee {
    private float managerBonus;

    public Manager(int employeeId, String employeeName, float salary) {
        super(employeeId, employeeName, salary);
        this.managerBonus = 0;
    }

    public float getManagerBonus() {
        return managerBonus;
    }

    @Override
    public void calculateBonus() {
        super.calculateBonus();
        managerBonus = getSalary() * 0.3f;
    }

    @Override
    public void displayEmloyeeDetails() {
        super.displayEmloyeeDetails();
        System.out.println("Manager Bonus: " + getManagerBonus());
    }
}
