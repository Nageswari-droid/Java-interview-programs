package com;

import java.util.*;

public class DictionaryClass {
	public static void main(String args[]) {
		String[] dictionaryArr = { "I", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man",
				"go", "mango" };
		String inputStr = "Ilikeicecream";
		String[] inputArr = inputStr.split("");

		int temp = 0;
		int flag = 0;
		int anotherTemp = 0;

		List<String> resultArr = new ArrayList<>();

		for (int i = 0; i < inputArr.length; i++) {
			temp = 0;
			for (int j = 0; j < dictionaryArr.length; j++) {
				if (inputArr[i].equals(dictionaryArr[j])) {
					resultArr.add(inputArr[i]);
					temp = 1;
					if (i == inputArr.length - 1) {
						flag = 1;
					}
					break;
				}
			}

			if (flag == 1) {
				System.out.println("Yes");
				for (int k = 0; k < resultArr.size(); k++) {
					System.out.print(resultArr.get(k) + " ");
				}
				break;
			}

			if (temp == 0 && i < inputArr.length - 1) {
				inputArr[i + 1] = inputArr[i] + inputArr[i + 1];
			}
		}

		if (flag == 1) {
			for (int k = 1; k < resultArr.size(); k++) {
				String concatStr = resultArr.get(k - 1) + resultArr.get(k);
				for (int j = 0; j < dictionaryArr.length; j++) {
					if (concatStr.equals(dictionaryArr[j])) {
						anotherTemp = 1;
						int index = k - 1;
						String result = concatStr;
						resultArr.remove(index);
						resultArr.set(index, result);
					}
				}
			}
			if (anotherTemp == 1) {
				System.out.println(" ");
				for (int k = 0; k < resultArr.size(); k++) {
					System.out.print(resultArr.get(k) + " ");
				}
			}
		}

		else {
			System.out.println("No");
		}
	}
}
