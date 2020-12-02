package com;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class OccurenceClass {
	public static void main(String args[]) {
		String input = "a1f10b20c15d0e1";
		String count = "";
		
		int k = 0;
		
		char element = ' ';

		LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();
		
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z' || input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				element = input.charAt(i);
				k = i + 1;
				count = "";
			}
			while(k < input.length() && (input.charAt(k) >= '0' && input.charAt(k) <= '9')) {
				count = count + input.charAt(k);
				k++;
			}	
			countMap.put(element, Integer.parseInt(count));
		}
		
		for(Entry<Character, Integer> m : countMap.entrySet()) {
			int limit = m.getValue();
			
			for(int i = 0 ; i < limit ; i++) {
				System.out.print(m.getKey());
			}
		}		
	}
}
