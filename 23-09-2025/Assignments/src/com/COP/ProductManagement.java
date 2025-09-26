package com.COP;

public class ProductManagement {
    private int productId;
    private String name;
    private float price;
    public int quantity;

    public ProductManagement(int productId, String name, float price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addStock(int quantityCount){
        this.quantity += quantityCount;
        System.out.println("Adding " + quantityCount + " to stock");
    }

    public void removeStock(int quantityCount){
        this.quantity -= quantityCount;
        System.out.println("Removing " + quantityCount + " from stock");
    }

    public void getProductDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
