package comparable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainComparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int index = 0; index < employees.length; index++) {
            System.out.println("Please enter employee details: ");

            int id,age;
            String name;

            System.out.print("Please enter employee id: ");
            id = sc.nextInt();
            System.out.print("Please enter employee name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Please enter employee age: ");
            age = sc.nextInt();


            employees[index] = new Employee(id, name, age);
            System.out.println("Employee details: " + employees[index]);
        }

    }
}
