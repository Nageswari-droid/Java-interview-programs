package com;

public class EvenPatternClass {
	public static void main(String args[]) {
		int num = 6;

		int[] resultant = new int[num];

		int iPointer = 0;
		int jPointer = num;

		int add = 0;
		int k = 0;

		int midPoint = (num / 2) + 1;

		for (int i = 0; i < (num / 2) + 1; i++) {
			k = iPointer;
			while (k != jPointer) {
				resultant[k] = num - add;
				k++;
			}
			iPointer++;
			jPointer--;
			add++;

			for (int l = 0; l < resultant.length; l++) {
				System.out.print(resultant[l] + "  ");
			}
			System.out.println();
		}
		
		add = add - 3;
		jPointer = jPointer + 2;
		
		for (int l = (num / 2) + 1; l < num; l++) {
			k = iPointer - 2;
			while (k != jPointer) {
				resultant[k] = num - add;
				k++;
			}
			iPointer--;
			add--;
			jPointer++;
			for (int m = 0; m < resultant.length; m++) {
				System.out.print(resultant[m] + "  ");
			}
			System.out.println();
		}
	}
}
