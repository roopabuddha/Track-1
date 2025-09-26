package com.threads.normal.Synchronisation;

public class Producer extends Thread {
    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;

        new Thread(this,"Producer").start();
    }

    public void run() {
        int counter = 1;
        while(true) { // this we are stopping in put (if statement) - synchronized method
            queue.put(counter++);
        }
    }
}
