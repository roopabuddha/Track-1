package com.interfaces;

public class MainBike {
    public static void main(String[] args) {
        Ivehicle bike = new Bike();
        bike.changeGear(1);
        bike.changeSpeed(20);
        bike.applyBreaks(3);
        bike.printStates();
    }
}
