package com.zeta;

import java.util.Scanner;

public class EmpSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfEmployees = 0;
        float totalSalary = 0.0f;
        System.out.print("Enter number of employees: ");
        noOfEmployees = sc.nextInt();

        float[] salaries = new float[noOfEmployees];
        for (int index = 0; index < noOfEmployees; index++) {
            System.out.println(salaries[index]);
        }

        for (int index = 0; index < noOfEmployees; index++) {
            System.out.println("please enter the salary for employee " + (index + 1));
            salaries[index] = sc.nextFloat();
            totalSalary += salaries[index];
        }

        System.out.println("Total salary of " + noOfEmployees + " employees : " + totalSalary);

//      To update the 4 th Update Salary
        System.out.println("Please enter the employee ID to update: ");
        int employeeID = sc.nextInt();
        System.out.println("Please enter the employee salary of ID to update: ");
        int updatedSalary = sc.nextInt();
        salaries[employeeID] = updatedSalary;
        System.out.println("Salary of Employee with id: "+ employeeID + " is "+ salaries[employeeID]);


    }
}
