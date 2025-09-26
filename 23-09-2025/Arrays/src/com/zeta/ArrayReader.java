package com.zeta;

import java.util.Scanner;

public class ArrayReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] prices = new float[5];

        for ( int index = 0; index < prices.length; index++ ) {
            System.out.printf("price[%s] = %s%n",index,prices[index]);
        }

        for (float price : prices) {
            System.out.println("price is " + price);
        }

        for (int index = 0; index < prices.length; index++) {
            System.out.printf("Please enter the price of the item you want to add for index %s%n: ",index);
            prices[index] = sc.nextFloat();
        }

        prices = new float[1];
        for (float price : prices) {
            System.out.println("price is " + price);
        }

        prices = new float[0];
        for (float price : prices) {
            System.out.println("price is " + price);
        }

//        prices = new float[-5];
//        for (float price : prices) {
//            System.out.println("price is " + price); throws NegativeArraySizeException exception
//        }
        String[] names = new String[1];
        names[0] = "Virat Kohli";
        System.out.println("My favorite cricketer is " + names[0]);

        sc.close();
    }
}
