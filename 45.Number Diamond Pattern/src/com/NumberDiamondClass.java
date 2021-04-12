package com;

public class NumberDiamondClass {
	public static void main(String args[]) {
		int num = 9;

		int iPointer = (num / 2) + 1;
		int midPoint = iPointer;

		int start = 1;
		int k = iPointer;

		int j = 0;

		String[] str = new String[num + 2];

		for (int l = 0; l < num + 2; l++) {
			str[l] = " ";
		}

		for (int i = 0; i < num - 1; i++) {
			k = iPointer;
			for (j = 0; j <= i; j++) {
				if (iPointer < (num + 2)) {
					str[iPointer] = String.valueOf(start);
					start++;
					iPointer = iPointer - 2;
				} else {
					break;
				}
			}

			iPointer = k + 1;

			if (iPointer <= (num + 2)) {
				for (int m = 0; m < str.length; m++) {
					System.out.print(str[m] + " ");
					str[m] = " ";
				}
				System.out.println("");
			}
		}

		iPointer = 0;
		start = start - 1;

		for (int i = num - (midPoint - 1); i >= 0; i--) {
			k = iPointer;
			for (j = 0; j <= i; j++) {
				if ((iPointer < num + 2) && (start >= 1)) {
					str[iPointer] = String.valueOf(start);
					start--;
					iPointer = iPointer + 2;
				} else {
					break;
				}
			}
			iPointer = k + 1;
			for (int m = 0; m < str.length; m++) {
				System.out.print(str[m] + " ");
				str[m] = " ";
			}
			System.out.println(" ");
		}
	}
}
