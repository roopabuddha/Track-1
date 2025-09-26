package com.Inheritance;

public class Employee {
    private int employeeId;
    private String employeeName;
    private float Salary;
    private float bonusofEmployee;

    public Employee(int employeeId, String employeeName, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.Salary = salary;
        this.bonusofEmployee = 0;

    }

    public float getBonusofEmployee() {
        return bonusofEmployee;
    }

    public void setBonusofEmployee(float bonusofEmployee) {
        this.bonusofEmployee = bonusofEmployee;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public void calculateBonus(){
        bonusofEmployee = Salary* bonusofEmployee;
    }

    public void displayEmloyeeDetails() {
        System.out.println("Id: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + Salary);
    }
}
