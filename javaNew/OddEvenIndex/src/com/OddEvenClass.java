package com;

public class OddEvenClass {
	public static void main(String args[]) {

		int[] inputArr = { 12, 100, 5, 10, 34, 17, 84 };
		int temp;

		for (int i = 0; i < inputArr.length; i = i + 2) {
			for (int j = 0; j < inputArr.length; j = j + 2) {
				if (inputArr[i] < inputArr[j]) {
					temp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[j] = temp;
				}
			}
		}

		for (int i = 1; i < inputArr.length; i = i + 2) {
			for (int j = 1; j < inputArr.length; j = j + 2) {
				if (inputArr[i] > inputArr[j]) {
					temp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[j] = temp;
				}
			}
		}

		for (int i = 0; i < inputArr.length; i++) {

			System.out.print(inputArr[i] + " ");

		}
	}
}
