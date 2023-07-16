package com.khan.dsa.array;

import java.util.Arrays;

public class ArrayInsertionTest {
    
    /**
     *
     * @param elements element array
     * @param n number of elements in the array
     * @param k position at which an item needs to be inserted
     * @param item item which needs to be inserted
     * @return an updated elements array
     */
    public static int[] insert(int[] elements, int n, int k, int item) {
        int j = n-1;
        while (j >= k-1) {
            elements[j+1] = elements[j];
            j--;
        }
        elements[k-1] = item;

        return elements;
    }
    public static void main(String[] args) {
        int[] elements = new int[6];
        elements[0] = 1;
        elements[1] = 2;
        elements[2] = 4;
        elements[3] = 5;
        elements[4] = 6;
        Arrays.stream(elements).forEach(i -> System.out.print(i+"\t"));
        System.out.println();
        int[] updatedElements = insert(elements, 5, 3, 3);
        Arrays.stream(updatedElements).forEach(i -> System.out.print(i+"\t"));
        System.out.println();
    }
}
