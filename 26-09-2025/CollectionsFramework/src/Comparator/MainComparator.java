package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainComparator {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < employees.length; count++) {
            float age;
            String name;

            System.out.println("Please enter Employee Age: ");
            age = input.nextFloat();
            System.out.println("Please enter Employee Name: ");
            input.nextLine();
            name = input.nextLine();
            employees[count] = new Employee(age, name);

        }
        for (int index = 0; index < employees.length; index++) {
            System.out.println(employees[index]);
        }

        AgeComparator ageComparator = new AgeComparator();
        NameComparitive nameComparitive = new NameComparitive();
        for (int index = 0; index < employees.length-1; index++) {
            System.out.println(employees[index]);
        }


    }
}
