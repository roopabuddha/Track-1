package collectioms.maps;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeObjectMap {
    public static void main(String[] args) {
        Integer id; //key
        String name,job;
        float salary;

        Scanner input = new Scanner(System.in);

        HashMap<Integer, Employee> employees = new HashMap<>();

        for (int counter = 1; counter <= 2; counter++) {

            System.out.println("please enter Employee Details......... : )");
            System.out.println("Please enter employee id: ");
            id = input.nextInt();
            input.nextLine();
            System.out.println("Please enter employee name: ");
            name = input.nextLine();
            System.out.println("Please enter employee job: ");
            job = input.nextLine();
            System.out.println("Please enter employee salary: ");
            salary = input.nextFloat();

            Employee emp = new Employee(name, job, salary);
            employees.put(id, emp);
            id = null;
            emp = null;
        }

        System.out.println("Employee details: ");
        System.out.println(employees);

        for (Integer key : employees.keySet()) {
            Employee emp = employees.get(key);
            System.out.println(emp);
        }

    }
}
