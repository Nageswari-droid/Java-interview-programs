package com;

import java.util.*;

public class NextGreatestClass {
	public static void main(String args[]) {
		
		int[] numArr = { 6, 3, 9, 10, 8, 2, 1, 15, 7 };
		int[] arrCopy = new int[numArr.length];
		
		List<String> outputStr = new ArrayList<>();
		
		for(int i = 0 ; i < arrCopy.length ; i++) {
			arrCopy[i] = numArr[i];
		}

		Arrays.sort(numArr);

		for (int i = 0; i < arrCopy.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				if (arrCopy[i] == numArr[j]) {
					if (j == numArr.length - 1) {
						outputStr.add(String.valueOf("_"));
					} else {
						outputStr.add(String.valueOf(numArr[j + 1]));
					}
				}
			}
		}
		
		
		for(int i = 0 ; i < outputStr.size() ; i++) {
			System.out.print(outputStr.get(i) + " ");
		}
	}
}
