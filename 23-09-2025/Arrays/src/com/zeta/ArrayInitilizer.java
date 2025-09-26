package com.zeta;

public class ArrayInitilizer {
    public static void main(String[] args) {
        int[] arrays = {15,16,17,18,19};
        for ( int index = 0; index < arrays.length; index++ ) {
            System.out.printf( "score[%s] = %s%n", index,arrays[index]);
        }
    }
}
