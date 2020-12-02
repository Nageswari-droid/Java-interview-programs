package com;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceClass {
	public static void main(String args[]) {
		int[] arr = {2, 3, 2, 6, 1, 6, 2};
		int count = 0 ;
		Map<Integer, Integer> hashArr = new HashMap<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			count = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(!hashArr.containsKey(arr[i])) {
				hashArr.put(arr[i], count);
			}
		}
		
		for(Entry<Integer, Integer> mapIterate : hashArr.entrySet()) {
			System.out.println(mapIterate.getKey() + " - " + mapIterate.getValue());
		}
	}
}
