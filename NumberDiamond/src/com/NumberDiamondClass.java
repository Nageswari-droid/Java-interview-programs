package com;

public class NumberDiamondClass {
	public static void main(String args[]) {
		int num = 5;
		
		int iPointer = (num / 2) + 1;
		
		int start = 1;
		int k = iPointer;
		
		String[] str = new String[num + 2];
		
		for(int i = 0 ; i < num + 2; i++) {
			str[i] = " "; 
		}
		
		for(int i = 0 ; i < num - 1; i++) {
			k = iPointer;
			for(int j = 0 ; j <= i ; j++) {
				str[iPointer] = String.valueOf(start);
				start++;
				iPointer = iPointer - 2;
			}
			iPointer = k + 1;
			for(int m = 0 ; m < str.length ; m++) {
				System.out.print(str[m] + " ");
				str[m] = " "; 
			}
			System.out.println(" ");
		}
		
		iPointer = 0;
		start = start - 1;
		
		for(int i = num - 2 ; i >= 0; i--) {
			k = iPointer;
			for(int j = 0 ; j <= i ; j++) {
				str[iPointer] = String.valueOf(start);
				start--;
				iPointer = iPointer + 2;
			}
			iPointer = k + 1;
			for(int m = 0 ; m < str.length ; m++) {
				System.out.print(str[m] + " ");
				str[m] = " "; 
			}
			System.out.println(" ");
		}
	}
}
