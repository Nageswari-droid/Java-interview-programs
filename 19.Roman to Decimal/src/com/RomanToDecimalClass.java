package com;

public class RomanToDecimalClass {
	public static void main(String args[]) {
		String str = "XIV";
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			int firstChar = valueMethod(str.charAt(i));

			if (i + 1 < str.length()) {
				int secondChar = valueMethod(str.charAt(i + 1));

				if (firstChar >= secondChar) {
					result = result + firstChar;
				} else {
					result = result + secondChar - firstChar;
					i++;
				}
			} else {
				result = result + firstChar;
			}
		}
		
		System.out.print(result);
	}

	public static int valueMethod(char val) {

		switch (val) {
		case 'I': {
			return 1;
		}
		case 'V': {
			return 5;
		}
		case 'X': {
			return 10;
		}
		case 'L': {
			return 50;
		}
		case 'C': {
			return 100;
		}
		case 'D': {
			return 500;
		}
		case 'M': {
			return 1000;
		}
		default: {
			return -1;
		}
		}
	}
}
