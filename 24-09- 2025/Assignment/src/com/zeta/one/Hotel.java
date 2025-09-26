package com.zeta.one;


public class Hotel extends Thread {
    private final Queueue queue;

    Hotel(Queueue queue) {
        this.queue = queue;
        new Thread(this, "Hotel").start();
    }

    public void run() {
        while (true) {
            queue.startRoomService();  // Start room service
            queue.roomService();  // Provide room service
        }
    }
}
