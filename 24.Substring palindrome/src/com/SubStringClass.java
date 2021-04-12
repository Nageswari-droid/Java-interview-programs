package com;

import java.util.*;
import java.util.Map.Entry;

public class SubStringClass {
	public static void main(String args[]) {

		String str = "abbaeae";
		String reverseStr = "";

		LinkedHashMap<String, String> palindrome = new LinkedHashMap<>();

		for (int i = 0; i < str.length() + 1; i++) {
			reverseStr = "";
			for (int j = i; j < str.length() + 1; j++) {
				if (reverseStr.length() >= 2) {

					boolean result = reverseMethod(reverseStr);

					if (result == true) {
						String index = "Index from " + String.valueOf(i) + " to " + String.valueOf(j - 1); 
						palindrome.put(reverseStr, index);
					}
					if(j < str.length()) {
						reverseStr += str.charAt(j);
					}

				} else {
					if(j < str.length()) {
						reverseStr = reverseStr + str.charAt(j);
					}
				}
			}
		}

		for(Entry<String, String> map : palindrome.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
		
		System.out.println("Substring palindrome count : " + palindrome.size());
	}

	public static boolean reverseMethod(String reverse) {

		int i = 0;
		int j = reverse.length() - 1;

		int count = 0;

		while (i < reverse.length() && j < reverse.length()) {
			if (reverse.charAt(i) == reverse.charAt(j)) {
				i++;
				j--;
				count++;
			} else {
				break;
			}
		}
		if (count == (reverse.length())) {
			return true;
		} else {
			return false;
		}
	}
}
