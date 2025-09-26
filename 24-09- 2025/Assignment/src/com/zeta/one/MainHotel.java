package com.zeta.one;

public class MainHotel {
    public static void main(String[] args) {
        final Queueue sharedQueue = new Queueue();

        // Create and start customer threads
        Customers customer1 = new Customers(sharedQueue, "Customer1");
        Customers customer2 = new Customers(sharedQueue, "Customer2");
        Customers customer3 = new Customers(sharedQueue, "Customer3");

        // Create and start the hotel thread
        Hotel hotel = new Hotel(sharedQueue);
    }
}
