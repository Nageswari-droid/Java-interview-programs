package com;

public class StringShiftClass {
	public static void main(String args[]) {

		String str = "sky Is Blue!";
		char[] tempStrArr = str.toCharArray();
		int shift = 4;

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				int value = (int) str.charAt(i);
				sum = value + shift;
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					if (sum > 122) {
						sum = sum - 26;
					}
				}
				else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					if(sum > 90) {
						sum = sum - 26;
					}
				}
				tempStrArr[i] = (char) (sum);
			}
		}

		for (int i = 0; i < tempStrArr.length; i++) {
			System.out.print(tempStrArr[i]);
		}
	}
}
