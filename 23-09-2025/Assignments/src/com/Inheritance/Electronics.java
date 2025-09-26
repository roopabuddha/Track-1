package com.Inheritance;

public class Electronics extends Product {
    public int warrantyPeriod;
    public String brandName;

    public Electronics(String nameOfProduct, double priceOfProduct, int warrantyPeriod, String brandName) {
        super(nameOfProduct, priceOfProduct);
        this.warrantyPeriod = warrantyPeriod;
        this.brandName = brandName;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty Period: " + getWarrantyPeriod());
        System.out.println("Brand: " + getBrandName());
    }
}
