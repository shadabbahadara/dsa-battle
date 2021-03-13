package com.khan.sorting;

import java.util.stream.IntStream;

public class BubbleSortUsingJava8 {
	public static int[] bubbleSort(int[] a) {
		int n = a.length;
		IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
			if (a[j - 1] > a[j]) {
				// switch
				int temp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = temp;
			}
		});
		return a;
	}

	public static void main(String[] args) {
		int[] unsortedArray = new int[] { 7, 2, 5, 9, 0, 3, 7 };
		System.out.print("unsorted array :");
		printArray(unsortedArray);
		System.out.println();
		System.out.print("sorted array: ");
		printArray(bubbleSort(unsortedArray));
	}

	private static void printArray(int[] a) {
		System.out.print("[ ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
}
