package com;

public class BaseClass {
	public static void main(String args[]) {
		int num = 5;

		int row = num;
		int column = num + 1;
		int start = 1;

		int[] resultantArr = new int[column];
		
		for (int i = 0; i < row; i++) {
			int difference = num - i - 1;
			int increment = num;
			int k = 0;
			resultantArr[k] = start;
			System.out.print(resultantArr[k] + " ");
			k++;
			while (difference != 0) {
				resultantArr[k] = resultantArr[k-1] + increment;
				System.out.print(resultantArr[k] + " ");
				increment--;
				difference--;
				k++;
			}
			start++;
			System.out.println();
		}
	}
}
