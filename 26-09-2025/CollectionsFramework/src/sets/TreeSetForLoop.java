package sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetForLoop {
    public static void main(String[] args) {
        TreeSet<String> treelang = new TreeSet<>();

//adds method without index parameter

        treelang.add("A");
        treelang.add("B");
        treelang.add("C");
        treelang.add("A");

        System.out.println(treelang);

        for (String str : treelang) {
            System.out.println(str);
        }


        Iterator<String> it = treelang.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        TreeSet<String> treelang2 = new TreeSet<>();
        treelang2.add("hello1");
        treelang2.add("hello2");
        treelang2.add("hello3");

        treelang.addAll(treelang2);

        System.out.println(treelang);


    }
}
