package com;

public class CharacterCount {

	public static void main(String args[]) {

		String input = "aaaabbccccffe";
		String result = "";

		int count = 1;
		int j = 1;
		int i = 0;

		while (i < input.length()) {
			count = 1;
			j = i + 1;
			while (j < input.length() && (input.charAt(i) == input.charAt(j))) {
				count++;
				j++;
			}
			result = result + input.charAt(i) + String.valueOf(count);
			i = j;
		}
		
		System.out.print(result);
	}
}
