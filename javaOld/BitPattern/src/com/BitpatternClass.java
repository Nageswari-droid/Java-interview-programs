package com;

import java.util.*;

public class BitpatternClass {
	public static void main(String args[]) {
		int limit = 4;
		int k = 2;
		int j = 1;
		int i = 0;

		String str = "11110110110111111";
		char[] strArr = str.toCharArray();

		int count = 1;
		int length = str.length();

		List<Character> bitList = new ArrayList<>();

		bitList.add(0, strArr[0]);
		bitList.add(1, strArr[1]);

		while (length > k - 1) {
			count = 1;

			while (bitList.get(j) == '1' && bitList.get(i) == '1' && k < length) {
				count++;
				j++;
				i++;

				if (count == limit) {
					bitList.add('0');
					break;
				}

				bitList.add(strArr[k]);
				k++;
			}

			if (k < length) {
				if (bitList.get(i) != '1' && bitList.get(j) != '1' || bitList.get(i) != bitList.get(j)) {
					bitList.add(strArr[k]);
					k++;
					i++;
					j++;
				}
			}
			else {
				k++;
			}
		}

		for (i = 0; i < bitList.size(); i++) {
			System.out.print(bitList.get(i));
		}
	}
}
