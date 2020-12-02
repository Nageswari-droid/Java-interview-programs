package com;

import java.util.*;

public class MonoNumberClass {
	public static void main(String args[]) {
		int num = 72581;
		String[] numStr = String.valueOf(num).split("");
		String result = "";

		int iPointer = 0;
		int jPointer = 1;

		List<Integer> resultList = new ArrayList<>();

		for (int i = 0; i < numStr.length; i++) {
			for (int j = 0; j < numStr.length; j++) {
				if (jPointer < numStr.length - 1) {
					resultList.add(Integer.parseInt(numStr[iPointer]) + Integer.parseInt(numStr[jPointer]));
					iPointer++;
					jPointer++;
				}
			}
		}
	}
}
