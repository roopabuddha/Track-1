package com.zeta;

import java.util.Scanner;

public class Calculator {
    float num1;
    float num2;
    float result;

    Scanner sc = new Scanner(System.in);


    public Calculator() {
        System.out.println("Inside Calculator");
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public void dataReader() {
        System.out.print("Please enter the first number: ");
        num1 = sc.nextFloat();
        System.out.print("Please enter the second number: ");
        num2 = sc.nextFloat();
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void numAddition() {
        result = num1 + num2;
    }

    public void numSubtraction() {
        result = num1 - num2;
    }

    public void numMultiplication() {
        result = num1 * num2;
    }

    public void numDivision() {
        result = num1 / num2;
    }

    public void getResult() {
        System.out.println("The result is: " + result);
    }



}
