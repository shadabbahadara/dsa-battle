package com.khan.dsa.array;

import java.util.stream.IntStream;

public class ArrayTraversalTest {
    public static void main(String[] args) {
        int[] dataArray = new int[10];
        dataArray[0] = 1;
        dataArray[2] = 3;
        dataArray[3] = 1;
//        IntStream.rangeClosed(0, dataArray.length-1)
//                .forEach(i -> System.out.print(" " + dataArray[i]));
        int i = 0;
        while (i < dataArray.length) {
            if (dataArray[i] != 0) {
                System.out.println(dataArray[i]);
            }
            i++;
        }
    }
}
