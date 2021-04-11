package com;

public class maxSum {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int first = arr[0];
		int second = arr[1];

		if (first < second) {
			first = arr[1];
			second = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}
		}

		System.out.print(first + second);
	}
}
