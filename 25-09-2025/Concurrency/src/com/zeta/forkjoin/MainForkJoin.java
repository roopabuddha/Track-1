package com.zeta.forkjoin;


import java.util.concurrent.ForkJoinPool;

public class MainForkJoin {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(numbers,0,numbers.length);
        int result = pool.invoke(task);
        System.out.println("sum of array " + result);

    }
}
