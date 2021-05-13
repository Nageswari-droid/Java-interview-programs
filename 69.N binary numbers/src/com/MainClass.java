package com;

public class MainClass {
	public static void main(String args[]) {
		int input = 6;
		double limit =  Math.pow(2, input);
		
		int[] resultant = new int[input];
		
		for(int i = 0 ; i < resultant.length ; i++) {
			resultant[i] = 0;
			System.out.print(resultant[i]);
		}
		
		System.out.println();
		
		for(int i = 1 ; i < limit ; i++) {
			
			int j = resultant.length - 1;
			int num = i ;
			
			while( num != 0 ) {
				resultant[j] = num % 2;
				num = num / 2;
				j--;
			}
			
			for(int k = 0 ; k < resultant.length ; k++) {
				System.out.print(resultant[k]);
				resultant[k] = 0;
			}
			
			System.out.println();
		}
	}
}
