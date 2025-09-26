package com.zeta;

public class Customer {
    //instance variables
    private int id;
    private String name;;
    private float billAmount;
    static int tollFreeNumber = 1234567990; //static member which is common foe everyone
    static {
        System.out.println("This id a static Block");
    }
    {
        System.out.println("This is non-static block");
    }
    public Customer(int id, String name, float billAmount) { //local scope
        this.id = id; //this refers to current object
        this.name = name;
        this.billAmount = billAmount;
        System.out.println("This is a Constructor block");
    }

    public void showDetails() {
        System.out.println(this.id + " " + this.name + " " + this.billAmount);
    }
}
