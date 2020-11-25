package com;

public class ReverseNewClass {
	public static void main(String[] args) {
		String ss = "A man, in the boat says : I see 1-2-3 in the sky";
		char[] c = new char[ss.length()];
		String spclCharLessString = "";
		String spclCharLessStringrev = "";

		for (int i = 0; i < ss.length(); i++) {
			if (((ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z') | (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z')
					| (ss.charAt(i) >= '0' && ss.charAt(i) <= '9'))) {
				spclCharLessString += ss.charAt(i);
			}
			c[i] = ss.charAt(i);
		}
		
		for (int i = spclCharLessString.length() - 1; i >= 0; i--) {
			spclCharLessStringrev += spclCharLessString.charAt(i);
		}
		int spclCharSpace = 0;
		for (int i = 0; i < ss.length(); i++) {
			if (((ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z') | (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z')
					| (ss.charAt(i) >= '0' && ss.charAt(i) <= '9'))) {
				c[i] = spclCharLessStringrev.charAt(i - spclCharSpace);
			} else {
				spclCharSpace++;
			}

		}
		
		for (char c1 : c) {
			System.out.print(c1);
		}

	}

}
