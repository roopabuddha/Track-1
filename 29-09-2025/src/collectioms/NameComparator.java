package collectioms;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        String employee1 = ((Employee)o1).getName();
        String employee2 = ((Employee)o2).getName();

        return employee1.compareTo(employee2);
    }
}
