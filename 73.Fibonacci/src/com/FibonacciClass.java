package com;

import java.util.Arrays;

public class FibonacciClass {
	public static void main(String args[]) {
		int[] arr = {2, 10, 4, 8, 0, 13};
		Arrays.sort(arr);
		int limit = arr[arr.length - 1];
		int first = 0, second = 1, sum = 0;
		
		for(int i = 0 ; i < limit ; i++) {
			sum = first + second;
			for(int j = 0 ; j < arr.length ; j++) {
				if(sum == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
			first = second;
			second = sum;
		}
	}
}
