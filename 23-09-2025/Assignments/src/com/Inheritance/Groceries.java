package com.Inheritance;

public class Groceries extends Product{
    public int date;
    public int month;
    public int year;
    public float weight;

    public Groceries(String nameOfProduct, double priceOfProduct, int date, int month, int year, float weight) {
        super(nameOfProduct, priceOfProduct);
        this.date = date;
        this.month = month;
        this.year = year;
        this.weight = weight;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void  displayProductInfo() {
        super.displayProductInfo();
        System.out.printf("ExpiryDate : %s / %s / %s%n",date,month,year);
        System.out.println("Weight: " + getWeight());
    }
}
