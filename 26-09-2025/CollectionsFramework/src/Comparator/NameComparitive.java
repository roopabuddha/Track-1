package Comparator;

import java.util.Comparator;

public class NameComparitive implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String e1 = ((Employee)o1).getName();
        String e2 = ((Employee)o2).getName();
        return e1.compareTo(e2);
    }
}
