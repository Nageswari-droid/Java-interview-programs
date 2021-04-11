package com;

import java.util.*;

public class ZeroArrayClass {
	public static void main(String args[]) {
		int[] arr = { 2 , 2 , 2 , 2 , 4 , 4 , 6 };

		int i = 1;
		int j = 0;

		int sum = 0;

		List<Integer> resultantList = new ArrayList<>();

		for (int k = 0; k < arr.length - 1; k++) {
			if (arr[i] == arr[j] && arr[j] != 0) {
				sum = arr[i] + arr[j];
				arr[j] = sum;
				arr[i] = 0;
			}
			i++;
			j++;
		}

		for (i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				resultantList.add(arr[i]);
			}		
		}
		
		for(i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 0) {
				resultantList.add(arr[i]);
			}
		}
		
		for(i = 0 ; i < resultantList.size(); i++) {
			System.out.print(resultantList.get(i) + " ");
		}
	}
}
