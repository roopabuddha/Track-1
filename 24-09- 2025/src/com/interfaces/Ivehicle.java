package com.interfaces;

public interface Ivehicle {

    public abstract void changeGear(int gear); //public and abstract are not needed because they are taken by default
    void changeSpeed(int speed);
    void applyBreaks(int decrement);
    void printStates();
}
