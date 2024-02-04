package com.khan.dsa.array;

import java.util.stream.IntStream;

public class ArrayDeletionTest {
    public static void main(String[] args) {
        int[] dataArray = new int[10];
        dataArray[0] = 1;
        dataArray[1] = 2;
        dataArray[2] = 3;
        dataArray[3] = 4;
        dataArray[4] = 5;
        dataArray[5] = 6;
        dataArray[6] = 7;
        dataArray[7] = 8;
        dataArray[8] = 9;
        dataArray[9] = 10;

        dataArray = delete(dataArray, 10, 5, 5);
        printElements(dataArray);

    }

    private static int[] delete(int[] dataArray, int totalElements, int position, int item) {
        for (int i=position-1; i>=totalElements-1; i++) {
            dataArray[i] = dataArray[i+1];
        }
        dataArray[totalElements-1] = 0;
        totalElements = totalElements-1;
        return dataArray;
    }

    private static void printElements(int[] dataArray) {
        IntStream.rangeClosed(0, dataArray.length-1)
                .filter(i -> dataArray[i] != 0)
                .forEach(i -> System.out.println(dataArray[i]));
    }
}
