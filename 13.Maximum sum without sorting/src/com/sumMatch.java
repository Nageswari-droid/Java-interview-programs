package com;

public class sumMatch {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int sum = 9;

		int first = arr[0];
		int last = arr[arr.length - 1];

		while (first < last) {
			if (first + last == sum) {
				System.out.println(first + " " + last);
				first++;
				last--;
			} else if (first + last < sum) {
				first++;
			} else {
				last--;
			}
		}
	}
}
