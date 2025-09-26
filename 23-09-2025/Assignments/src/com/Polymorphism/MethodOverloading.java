package com.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class MethodOverloading {
    public static void main(String[] args) {
        Order order = new Order();
        Products product1 = new Products("Laptop", 60000);
        Products product2 = new Products("Tablet", 50000);

        order.addProduct(product1);
        order.addProduct(product2,2);

        List<Products> produtt = new ArrayList<>();
        produtt.add(new Products("mobile", 60000));
        produtt.add(new Products("hero", 50000));

        order.addProduct(produtt);
        order.displayProducts();


    }
}
