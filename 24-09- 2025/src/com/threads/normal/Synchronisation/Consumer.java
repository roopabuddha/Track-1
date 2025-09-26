package com.threads.normal.Synchronisation;

public class Consumer extends Thread {
    Queue queue;
    Consumer(Queue queue) {
        this.queue = queue;
        new Thread(this,"Consumer").start();
    }

    public void run() {
        while(true) {
            queue.get(); //synchronized method
        }
    }
}
