package com.khan.dsa.sorting;

/*
 * Algorithm
 * generate 20 random numbers using Random
 * store these numbers in array list
 * apply bubble sort
 * store sorted array list into the file
 */
public class BubbleSortApp {
	public static int[] bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
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
