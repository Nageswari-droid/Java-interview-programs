package com;

import java.util.*;
import java.util.Map.Entry;

public class ThreeMaxClass {
	public static void main(String args[]) {

		int array[] = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3 };
		int count = 0;
		int max = 0;

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (!countMap.containsKey(array[i])) {
				countMap.put(array[i], count);
			}
		}
		
		LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
		 
		countMap.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		    .forEach(x->reverseSortedMap.put(x.getKey(), x.getValue()));
		
		for(Entry<Integer, Integer> map : reverseSortedMap.entrySet()) {
			if(max < 3) {
				System.out.print(map.getKey() + " ");
				max++;
			}
		}
	}
}
