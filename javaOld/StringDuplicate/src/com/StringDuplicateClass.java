package com;

public class StringDuplicateClass {
	public static void main(String args[]) {
		String strOne = "expErIence";
		String strTwo = "En";
		
		String result = "";
		
		int count = 0;
		
		for(int i = 0 ; i < strOne.length() ; i++) {
			count = 0;
			for(int j = 0 ; j < strTwo.length() ; j++) {
				if(strOne.charAt(i) != strTwo.charAt(j)) {
					count++;
				}
			}
			
			if(count == strTwo.length()) {
				result = result + strOne.charAt(i);
			}
		}
		
		System.out.println(result);
	}
}
