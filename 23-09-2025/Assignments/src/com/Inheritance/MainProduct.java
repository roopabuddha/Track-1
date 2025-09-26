package com.Inheritance;

public class MainProduct {
    public static void main(String[] args) {
        Product elec = new Product("Mobile", 80000);
        elec.displayProductInfo();
        System.out.println("\n");
        Electronics ele = new Electronics("Mobile",80000,16,"Apple");
        ele.displayProductInfo();
        System.out.println("\n");
        Clothing clothing = new Clothing("kurta",800,"s","Apple");
        clothing.displayProductInfo();
        System.out.println("\n");
        Groceries groceries = new Groceries("rice",1200,4,6,2026,1000);
        groceries.displayProductInfo();
    }
}
