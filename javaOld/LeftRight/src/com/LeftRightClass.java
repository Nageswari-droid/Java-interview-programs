package com;

public class LeftRightClass {
	public static void main(String args[]) {
		int num = 6;
		int[] numArr = { 1, 3, 4, 2, 7, 8 };
		int flag = 0;
		int count = 0;

		for (int i = 1; i < numArr.length - 1; i++) {
			
			int first = 0;
			int last = i + 1;
			count = 0;
			
			while (first != i) {
				if (numArr[first] < numArr[i]) {
					count++;
					first++;
				} else {
					break;
				}
			}

			while (last != numArr.length) {
				if (numArr[last] > numArr[i]) {
					count++;
					last++;
				} else {
					break;
				}
			}

			if (count == num - 1) {
				flag = 1;
				System.out.println(numArr[i]);
			}
		}
		
		if(flag == 0) {
			System.out.print(-1);
		}
	}
}
