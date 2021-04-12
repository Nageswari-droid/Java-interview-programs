package com;

public class maxSum {
	public static void main(String args[]) {
		int[] arr = { 2, 1, 8, 5, 6, 4 };
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
			if(arr[i] < first && arr[i] > second) {
				second = arr[i];
			}
		}

		System.out.print(first + second);
	}
}
