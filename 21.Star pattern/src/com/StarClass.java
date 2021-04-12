package com;

public class StarClass {
	public static void main(String args[]) {
		
		int num = 7;
		int count = 0;
		int temp = num + (num - 1);
		int midPoint = temp / 2;
		int iPointer = midPoint;
		
		String[] str = new String[temp]; 
		
		for(int i = 0 ; i < str.length; i++) {
			str[i] = " ";
		}
		
		for(int i = 0 ; i < num; i++) {
			midPoint = iPointer;
			count = 0;
			while(count < num ) {
				str[midPoint] = "*";
				midPoint++;
				count++;
			}
			iPointer--;
			
			for(int j = 0 ; j < str.length ; j++) {
				System.out.print(str[j] + " ");
				str[j] = " ";
			}
			System.out.println("");
		}
	}
}
