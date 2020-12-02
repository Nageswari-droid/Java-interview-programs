package com;

import java.util.*;

public class SameEleClass{
	public static void main(String args[]) {

		int arr[] = { 7 , 1 , 2 , 4 , 5 , 5 , 6 , 7 , 7 , 8 , 4};
		int pos[] = new int[arr.length];
		int count = 0;

		for (int i = 0; i < pos.length; i++) {
			pos[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			int k = 0;

			if(i != arr.length - 1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j] && arr[i] != -1) {
						arr[j] = -1;
						pos[k] = j;
						k++;
					}
				}		
			}
			
			if(arr[i] != -1) {
				System.out.print(arr[i] + " : ");
				System.out.print(i);
			}

			for (int l = 0; l < pos.length; l++) {
				if (pos[l] != -1) {
					System.out.print( " , " + pos[l]);
					pos[l] = -1;
				}
			}
			
			if(arr[i] != -1) {
				System.out.println("");
			}
		}
	}
}
