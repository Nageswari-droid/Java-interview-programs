package com;

import java.util.*;

public class AlternateClass {
	
	public static void main(String args[]) {
		int[] numArr = {5,2,8,7,4,3,9,10};
		int[] resultantArr = new int[numArr.length];
		int j = 0 ;
		int temp;
		int limit = 0;
		int ascendingLimit = 0;
		
		for( int i = 0 ; i < numArr.length ; i++ ) {
			for( j = 0 ; j < numArr.length ; j++ ) {
				if(numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		if(numArr.length % 2 != 0) {
			limit = (numArr.length)/2;
			ascendingLimit = ((numArr.length)/2) + 1;
		}
		else {
			limit = (numArr.length)/2 - 1;
			ascendingLimit = ((numArr.length)/2);
		}
		
		j = 0;
		
		for(int i = 0 ; i <= limit ; i++) {
			resultantArr[j] = numArr[i];
			j = j + 2;
		}
		
		j = 1;
		
		for(int i = (numArr.length) - 1 ; i >= ascendingLimit ; i--) {
			resultantArr[j] = numArr[i];
			j = j + 2;
		}
		
		for(int i = 0 ; i < resultantArr.length ; i++ ) {
			System.out.print(resultantArr[i] + " ");
		}
	}
}