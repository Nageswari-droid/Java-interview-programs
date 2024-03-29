package com;

import java.util.*;
import java.util.Map.Entry;

public class CacheClass {
	public static void main(String args[]) {
		int num = 3;
		int jPointer = 0;
		String queries = "SET 1 2 SET 3 4 SET 4 5 GET 4 GET 1 GET 3";
		String[] strArr = queries.split(" ");
		
		List<Integer> key = new ArrayList<>();

		Map<Integer, Integer> setMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals("SET")) {
				if (jPointer == num) {
					Map.Entry<Integer, Integer> entry = setMap.entrySet().iterator().next();
					setMap.remove(entry.getKey());
					setMap.remove(entry.getValue());
					jPointer = 0;
				}

				setMap.put(Integer.parseInt(strArr[i + 1]), Integer.parseInt(strArr[i + 2]));
				jPointer++;

			} else if (strArr[i].equals("GET")) {
				key.add(Integer.parseInt(strArr[i + 1]));
			}
		}
		
		for(int i = 0 ; i < key.size(); i++) {
			for (Entry m : setMap.entrySet()) {
				if(!setMap.containsKey(key.get(i))) {
					System.out.print("-1 ");
					break;
				}
				else if((int) m.getKey() == key.get(i)) {
					System.out.print(m.getValue() + " ");
				}
			}
		}
	}
}
