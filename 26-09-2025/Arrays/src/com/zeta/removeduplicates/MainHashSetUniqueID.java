package com.zeta.removeduplicates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainHashSetUniqueID {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        set.add(new Employee(101, "Alex"));
        set.add(new Employee(102, "Bob"));
        set.add(new Employee(103, "Carl"));

        System.out.println(set);

        set.add(new Employee(   101, "Alex"));
        set.add(new Employee(102, "Bob"));

        System.out.println(set);

        Iterator<Employee> iterator = set.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.hashCode());
        }

    }
}
