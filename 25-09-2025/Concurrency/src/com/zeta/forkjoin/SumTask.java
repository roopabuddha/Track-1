package com.zeta.forkjoin;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (start == end-1){
            return arr[start];
        } else {
            int mid = (end + start)/2;
            SumTask leftTask = new SumTask(arr, start, mid); //one core processor executes
            SumTask rightTask = new SumTask(arr, mid, end); //Another core processor executes


//          fork is a method
//
//          conquering the objects - for sub tasks
            leftTask.fork();
            rightTask.fork();

//          join forks
            return leftTask.join() + rightTask.join();
        }
    }
}
