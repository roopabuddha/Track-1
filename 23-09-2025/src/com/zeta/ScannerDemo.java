package com.zeta;

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter an Integer value:");
        int num;
        num = sc.nextInt();
        System.out.println("The number you entered is " + num);
    }
}