package com;

public class ConsecutiveClass {
	public static void main(String args[]) {
		String str = "AAA EEE EEE EEE CCC DDDDDD EEE EEE EEE EEE";
		String word = "EEE";
		
		String strArr[] = str.split(" ");
		
		for(int i = 0 ; i < strArr.length ; i++) {
			int count = 0;
			for(int j = i ; j < i + 3 ; j++) {
				if(i > strArr.length - 2) {
					break;
				}
				if(word.equals(strArr[j])) {
					count++;
				}
				else {
					break;
				}
			}
			
			if(count == 3) {
				for(int j = i ; j < i + 3 ; j++) {
					strArr[j] = " "; 
				}
			}
		}
		
		for(int i = 0 ; i < strArr.length ; i++) {
			if(strArr[i] != " ") {
				System.out.print(strArr[i] + " ");
			}
		}
	}
}
