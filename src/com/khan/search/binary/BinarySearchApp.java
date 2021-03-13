package com.khan.search.binary;

public class BinarySearchApp {
	public static int binarySearch(int[] a, int item) {
		int loc = 0;
		int beg = 0;
		int end = a.length - 1;
		int mid = (beg + end) / 2;
		while (beg <= end && a[mid] != item) {
			if (item < a[mid]) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}
			mid = (beg + end) / 2;
		}
		if (a[mid] == item)
			loc = mid;
		else
			loc = -1;
		return loc;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("location index: " + binarySearch(a, 5));
	}
}
