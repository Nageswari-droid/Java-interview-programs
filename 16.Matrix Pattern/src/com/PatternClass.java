package com;

public class PatternClass {
	public static void main(String args[]) {
		
		int input = 3;
		int num = 1;
		int[][] matArr = new int[input][input];
		
		for(int j = 0 ; j < input ; j++) {
			if(j % 2 == 0) {
				int temp = input - 1;
				for(int i = temp ; i >= 0 ; i--) {
					matArr[i][j] = num;
					num++;
				}
			}
			else {
				int temp = 0;
				for(int i = temp ; i < input ; i++) {
					matArr[i][j] = num;
					num++;
				}
			}
		}
		
		for(int i = 0 ; i < input ; i++) {
			for(int j = 0 ; j < input ; j++) {
				System.out.print(matArr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}


//Input

//3 (3*3 matrix)

//Output

//3 4 9 
//2 5 8 
//1 6 7






