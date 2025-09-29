package collectioms;


import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Employee> nameComp = new TreeSet<Employee>(new NameComparator());

        nameComp.add(new Employee("Rupa", 220000));
        nameComp.add(new Employee("Virat", 350000));
        nameComp.add(new Employee("Virat", 360000));
        nameComp.add(new Employee("Ronaldo", 350000));
        System.out.println("Name wise sorted list...");
        for (Employee e : nameComp) {
            System.out.println(e);
        }

        System.out.println("salary wise sorted list...");
        TreeSet<Employee> salComp = new TreeSet<>(new salaryComparator());
        salComp.add(new Employee("Rupa", 220000));
        salComp.add(new Employee("Virat", 350000));
        salComp.add(new Employee("Virat", 350000));
        salComp.add(new Employee("kiran", 350000));

        salComp.add(new Employee("Ronaldo", 350000));
        for (Employee e : salComp) {
            System.out.println(e);
        }






    }
}
