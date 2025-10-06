package com.zeta.test;


public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        if (id<=0) throw  new IllegalArgumentException("Invalid ID");
        if (name==null) throw  new IllegalArgumentException("Name cannot be empty");
        if (price<=0) throw  new IllegalArgumentException("Price cannot be negative");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
