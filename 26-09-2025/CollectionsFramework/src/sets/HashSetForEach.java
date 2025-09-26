package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetForEach {
    public static void main(String[] args) {
        HashSet<String> setlang = new HashSet<>();
        setlang.add("Java");
        setlang.add("C#");
        setlang.add("Python");
        setlang.add("PHP");
        setlang.add("C#"); //will not add




        for (String lang : setlang)
        {
            System.out.println(lang);
        }

        Iterator<String> it = setlang.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
