package com.Inheritance;

public class Clothing extends Product {
    public String sizeOfProduct;
    public String materialofProduct;


    public Clothing(String nameOfProduct, double priceOfProduct, String sizeOfProduct, String materialofProduct) {
        super(nameOfProduct, priceOfProduct);
        this.sizeOfProduct = sizeOfProduct;
        this.materialofProduct = materialofProduct;
    }

    public String getSizeOfProduct() {
        return sizeOfProduct;
    }

    public void setSizeOfProduct(String sizeOfProduct) {
        this.sizeOfProduct = sizeOfProduct;
    }

    public String getMaterialofProduct() {
        return materialofProduct;
    }

    public void setMaterialofProduct(String materialofProduct) {
        this.materialofProduct = materialofProduct;
    }

    @Override
    public void displayProductInfo(){
        super.displayProductInfo();
        System.out.println("Size: " + getSizeOfProduct());
        System.out.println("Material: " + getMaterialofProduct());
    }
}
