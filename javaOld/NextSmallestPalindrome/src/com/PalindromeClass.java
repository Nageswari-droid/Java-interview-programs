package com;

public class PalindromeClass {
	public static void main(String args[]) {
		int arr[] = { 2, 4, 5, 7 };

		String numStr = "";
		String resultStr = "";

		for (int i = 0; i < arr.length; i++) {
			numStr = numStr + String.valueOf(arr[i]);
		}

		long numValue = Long.parseLong(numStr);
		long limit = numValue + 100000000;

		for (long i = numValue + 1; i < limit; i++) {

			long temp = i;
			long rem = 0;
			resultStr = "";

			while (temp != 0) {

				rem = temp % 10;
				resultStr = resultStr + String.valueOf(rem);
				temp = temp / 10;

			}

			if (Long.parseLong(resultStr) == i) {
				System.out.print(i);
				break;
			}
		}
	}
}
