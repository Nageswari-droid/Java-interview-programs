package com;

public class DistinctStringClass {
	public static void main(String args[]) {
		String strOne = "skyIsblue";
		String strTwo = "eyes";
		
		String result = "";
		
		int flag = 0;
		
		for(int i = 0 ;  i < strOne.length() ; i++) {
			flag = 0;
			for(int j = 0 ; j < strTwo.length() ; j++) {
				if(strOne.charAt(i) == strTwo.charAt(j)) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				result = result + strOne.charAt(i);
			}
		}
		
		System.out.print(result);
	}
}
