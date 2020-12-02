package com;

public class AverageClass {
	public static void main(String args[]) {
		int[] arr = {2 , 2 , 4 , 0 , 2 , 6};
		
		int rightSum = 0;
		int leftSum = 0;
		int j;
		
		for(int i = 0 ; i < arr.length ; i++) {
			leftSum = leftSum + arr[i];
			rightSum = 0;
			for(j = i + 1; j < arr.length ; j++) {
				rightSum = rightSum + arr[j];
			}
			
			if((j - 1) - i == 0) {
				if((int)Math.floor((leftSum) / ( i + 1 )) == (int)Math.floor((rightSum) / (j) - i)) {
					System.out.print("From( 0 , " + i + " ) to ( " + (i + 1) + " , " + (arr.length - 1) + " )");
				}
			}
			else {
				if((int)(Math.floor((leftSum) / ( i + 1 ))) == (int)(Math.floor((rightSum) / ((j - 1) - i)))) {
					System.out.print("From( 0 , " + i + " ) to ( " + (i + 1) + " , " + (arr.length - 1) + " )");
				}
			}
			
			System.out.println("");
		}
	}
}
