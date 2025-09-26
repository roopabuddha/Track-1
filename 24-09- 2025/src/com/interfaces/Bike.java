package com.interfaces;

public class Bike implements Ivehicle {
    int speed;
    int gear;


    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void changeSpeed(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        System.out.println("Breaks applied Speed reduced");
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("Gear: " + gear + " Speed: " + speed);
    }
}
