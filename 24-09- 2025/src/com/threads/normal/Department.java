package com.threads.normal;

public class Department extends Thread {
    String name;
    Department(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Department " + this.name + " task - " + counter);
            try {
                Thread.sleep(500);
            }  catch (InterruptedException e) {
                e.printStackTrace(); //shows the root cause of exception
            }
        }
    }
}
