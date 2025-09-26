package lists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListLang {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C");

        for (int index = 0; index < list.size(); index++) {
            System.out.println("first Way " + list.get(index));
        }

        for (String index : list) {
            System.out.println("Second Way " + index);
        }

        Collections.sort(list);
        System.out.println("sorted list");
        for (String index : list) {
            System.out.println(index);
        }
        System.out.println(list.get(3));

        list.add(4,"C");
        System.out.println(list);
        list.remove(4);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        System.out.println(list);

        System.out.println("While using iterator");
        Iterator itr = list2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
