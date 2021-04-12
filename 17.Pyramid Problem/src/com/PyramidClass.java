package com;

public class PyramidClass {
	public static void main(String args[]) {
		int input = 4;
		int column = input + (input - 1);
		int midPoint = column/2;
		int iPointer = midPoint;
		int jPointer = midPoint;
		int num = 1;
		int count = 0;
		
		int tempIpointer = iPointer;
		int tempJPointer = jPointer;
		
		String[] resultArr = new String[column];
		
		for(int i = 0 ; i < resultArr.length; i++) {
			resultArr[i] = " ";
		}
		
		for(int i = 0 ; i < input ; i++) {
			count = 0;
			
			iPointer = tempIpointer;
			jPointer = tempJPointer;
			
			while(count <= i) {
				resultArr[iPointer] = String.valueOf(num);
				resultArr[jPointer] = String.valueOf(num);
				num++;
				count++;
				jPointer--;
				iPointer++;
			}
			
			for(int j = 0 ; j < resultArr.length ; j++) {
				System.out.print(resultArr[j] + " ");
				resultArr[j] = " ";
			}
			System.out.println();
			tempIpointer--;
			tempJPointer++;
		}
	}
}