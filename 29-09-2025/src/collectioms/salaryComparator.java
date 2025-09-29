package collectioms;

import java.util.Comparator;
import java.util.Objects;

public class salaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        float salary1 = o1.getSalary();
        float salary2 = o2.getSalary();
        if(salary1 > salary2) {
            return 1;
        } else if (salary1 == salary2 && o1.getName()==o2.getName()) {
            return 0;
    } else {
            return -1;
        }

//        return (Float.compare(salary1.getSalary(), salary2.getSalary());
    }
}
