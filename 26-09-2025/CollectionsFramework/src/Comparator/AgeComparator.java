package Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        float emp1 = ((Employee)o1).getAge();
        float emp2 = ((Employee)o2).getAge();

        if (emp1 > emp2)
            return 1;
        else if (emp1 < emp2)
            return -1;
        else
            return 0;

    }
}
