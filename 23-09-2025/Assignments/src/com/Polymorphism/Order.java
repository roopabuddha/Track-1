package com.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Products> produt = new ArrayList<>();
    List<Integer> quantities = new ArrayList<>();

    public void addProduct(Products p) {
        addProduct(p,1);
    }
    public void addProduct(Products p, int quantity) {
        produt.add(p);
        quantities.add(quantity);
        System.out.println("Added product with quantity " + quantity + p.name);
    }

    public void addProduct(List<Products> ps) {
        for (Products p : ps) {
            addProduct(p);
        }
    }

    public void displayProducts() {
        for (Products p : produt) {
            System.out.println("Product Name: " +  p.name);
        }
    }

}
