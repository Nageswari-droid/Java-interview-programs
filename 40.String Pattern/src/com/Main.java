package com;

public class Main {

	public static void main(String[] args) {
		String str = "program";
		int strLength = str.length();
		int midPoint = strLength / 2;
		String resultant = "";
		int jPointer = midPoint;

		while (jPointer != str.length()) {
			resultant = resultant + str.charAt(jPointer);
			System.out.println(resultant);
			jPointer++;
		}

		jPointer = 0;
		while (jPointer != midPoint) {
			resultant = resultant + str.charAt(jPointer);
			System.out.println(resultant);
			jPointer++;
		}

	}

}

