package com;

import java.util.*;
import java.util.Map.Entry;

public class ThreeMaxClass {
	public static void main(String args[]) {

		int array[] = { 3, 4, 2, 3, 3, 15, 16, 15, 15, 16, 2, 3, 3, 3, 3 };
		int count = 0;
		int max = 0;
		int maxValue = 0;
		int limit = 0;

		Map<Integer,Integer> maxCount = new HashMap<>();

		for(int i = 0 ; i < array.length ; i++) {
			count = 0;
			for(int j = 1 ; j < array.length ; j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}

			if(!maxCount.containsKey(array[i])) {
				maxCount.put(array[i], count);
			}
		}

		while(maxCount.size() != 0) {
			for(Entry<Integer, Integer> m : maxCount.entrySet()) {
				if(max < m.getValue()) {
					max = m.getValue();
					maxValue = m.getKey();
				}
			}
			if(limit < 3) {
				System.out.println(maxValue + " - " + max);
				limit++;
			}
			maxCount.remove(maxValue);
			max = 0;
		}
	}
}
