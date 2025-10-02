package MemoryManagement;

import java.util.ArrayList;
import java.util.List;

public class MainStaticCollectionLeak {
    private static final List<Customer> customerList = new ArrayList<>();

    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            customerList.add(new Customer("Customer-" + counter++));
            if (counter%100000==0)
                System.out.println("Customers in memory:" + customerList.size());
        }

    }
}
