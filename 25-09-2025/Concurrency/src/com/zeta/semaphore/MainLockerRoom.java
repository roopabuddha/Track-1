package com.zeta.semaphore;

import java.util.concurrent.Semaphore;

public class MainLockerRoom {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        Thread Rupa = new Thread(new LockerRoom("Customer-1 : Rupa", semaphore));
        Thread uday = new Thread(new LockerRoom("Customer-2 : Uday", semaphore));
        Rupa.start();
        uday.start();

    }
}
