package com;

import java.util.*;

public class ConsecutiveClass {
	public static void main(String args[]) {
		
		String str = "aaabbbacccddddcccdd";
		
		Vector<Character> v = new Vector<>(); 
		
		for(int i = 0  ; i < str.length() ; i++) {
		
			v.add(str.charAt(i)); 
			  
	        if (v.size() > 2)  
	        { 
	            int sz = v.size(); 
	            if (v.get(sz - 1) == v.get(sz - 2) &&  
	                v.get(sz - 2) == v.get(sz - 3))  
	            { 
	                v.setSize(sz - 3); 
	            } 
	        }
		
		}
		
		for (int i = 0; i < v.size(); ++i) 
	        System.out.print(v.get(i)); 
	}
}
