package com.COP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement product = new ProductManagement(123,"iphone",10000,10);
        CustomerManagement customer = new CustomerManagement(18,"virat","viratkohli@gmail.com");

        System.out.printf("The Available Quantity for Product %s is %s",product.getProductId(),product.getQuantity());

        boolean flag = true;

        while (flag) {
            System.out.println("----Main Memu----");
            System.out.println("1.Get Product Details");
            System.out.println("2.Get Customer Details");
            System.out.println("3.Add Stock");
            System.out.println("4.Reduce Stock");
            System.out.println("5.exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    product.getProductDetails();
                    break;
                case 2:
                    customer.getCustomerDetails();
                    break;
                case 3:
                    System.out.println("Please Enter Quantity to Add Stock");
                    int getQuantityAdd = sc.nextInt();
                    product.addStock(getQuantityAdd);
                    System.out.printf("Added Stock of Product %s by Quantity %s",product.getName(),getQuantityAdd);
                    break;
                case 4:
                    System.out.println("Please Enter Quantity to Reduce Stock");
                    int getQuantityRemove = sc.nextInt();
                    product.removeStock(getQuantityRemove);
                    System.out.printf("Added Stock of Product %s by Quantity %s",product.getName(),getQuantityRemove);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice Try again!");
                    break;
            }


        }



    }
}
