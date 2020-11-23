package com;

public class ThresholdClass {
	public static void main(String args[]) {

		int[] arr = { 5, 8, 10, 13, 6, 2 };
		int threshold = 3;
		int count = 0;
		int sum = 0;
		int element;

		for (int i = 0; i < arr.length; i++) {
			element = arr[i];
			sum = 0;
			if (element > threshold) {
				while (sum != element) {
					sum = sum + threshold;
					if (sum > element) {
						sum = element;
						count++;
						break;
					}
					count++;
				}
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}
}
