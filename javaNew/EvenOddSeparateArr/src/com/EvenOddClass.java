package com;

import java.util.*;

public class EvenOddClass {
	public static void main(String args[]) {
		int[] inputArr = { 12, 100, 5, 10, 34, 17, 84 };

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		for (int j = 0; j < inputArr.length; j++) {
			if (j % 2 == 0) {
				evenList.add(inputArr[j]);
			} else {
				oddList.add(inputArr[j]);
			}
		}
		
		Collections.sort(evenList);
		Collections.sort(oddList, Collections.reverseOrder());
		
		for(int i = 0 ; i < evenList.size() ; i++) {
			System.out.print(evenList.get(i) + " ");
		}
		
		System.out.println("");
		
		for(int i = 0 ; i < oddList.size() ; i++) {
			System.out.print(oddList.get(i) + " ");
		}
	}
}
