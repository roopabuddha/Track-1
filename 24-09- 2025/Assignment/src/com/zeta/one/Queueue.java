package com.zeta.one;

public class Queueue {
    private boolean roomServiceActive = false;
    int n;

    // Customer checks in to the hotel
    public synchronized void checkIn(String customerName,int n) {
        while (roomServiceActive) {
            try {
                System.out.println(customerName + " is waiting to check in as room service is active.");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught during check-in.");
            }
        }
        this.n = n;
        roomServiceActive = true;
        if (n<=5) {
            System.out.println(customerName + " has successfully checked in.");
        }  else {
            System.exit(0);
        }
        notify();  // Release the lock
    }

    // Hotel provides room service
    public synchronized void roomService() {
        while (!roomServiceActive) {
            try {
                System.out.println("Room service is not active. Waiting for customer check-in.");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught during room service.");
            }
        }
        roomServiceActive = false; // Ending room service
        if (n<=5) {
            System.out.println("Room service is now active.");
        } else {
            System.exit(0);
        }
        notify();  // Release the lock
    }

    // Start room service (external trigger)
    public synchronized void startRoomService() {
        roomServiceActive = true;
        System.out.println("Room service is now starting.");
        notify();  // Release the lock
    }
}
