package com.zeta;

import java.util.Scanner;

public class ProductCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] products = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Please Enter product[%s][%s]: ", row+1, col+1);
                products[row][col] = sc.nextInt();
            }
        }

        System.out.println("The resultant Matrix is :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(products[row][col] + "\t");
            }
            System.out.println();
        }

        long totalSumOfProducts = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                totalSumOfProducts += products[row][col];
                System.out.println("The Total Amount of Products is: " + totalSumOfProducts);
            }
        }
    }
}
