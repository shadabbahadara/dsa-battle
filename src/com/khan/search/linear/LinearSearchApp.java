package com.khan.search.linear;

public class LinearSearchApp {

	public static int linearSearch(int[] a, int item) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == item)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("location index: " + linearSearch(a, 4));
	}

}
