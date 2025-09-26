package com.Inheritance;

public class Product {
    public String nameOfProduct;
    public double priceOfProduct;

    public Product(String nameOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public void displayProductInfo() {
        System.out.println("Name: " + getNameOfProduct());
        System.out.println("Price: " + getPriceOfProduct());
    }
}
