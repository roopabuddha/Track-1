package com.zeta;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.dataReader();
        calculator.getResult();

        calculator.numAddition();
        calculator.getResult();

        calculator.numSubtraction();
        calculator.getResult();

        calculator.numMultiplication();
        calculator.getResult();

        calculator.numDivision();
        calculator.getResult();

    }
}
