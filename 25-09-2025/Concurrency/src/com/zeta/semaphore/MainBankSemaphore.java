package com.zeta.semaphore;

import java.util.concurrent.Semaphore;

public class MainBankSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Thread Rupa = new Thread(new AtmRoom("Customer-1 : Rupa", semaphore));
        Thread Latha = new Thread(new AtmRoom("Customer-2 : Latha", semaphore));
        Thread Uday = new Thread(new AtmRoom("Customer-3 : Uday", semaphore));
        Thread Ganesh = new Thread(new AtmRoom("Customer-4 : Ganesh", semaphore));

        Rupa.start();
        Latha.start();
        Uday.start();
        Ganesh.start();

    }
}
