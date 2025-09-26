package com.threads.normal.Synchronisation;

public class InterThreadCommunication {
    public static void main(String[] args) {
        final Queue sharedQueue = new Queue();

        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);
    }
}
