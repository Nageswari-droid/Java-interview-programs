package com;

import java.util.*;

public class FragmentClass {
	public static void main(String args[]) {
		String strOne = "Every morning I want to do exercise regularly";
		String strTwo = "Every morning I want to do meditation without fail";
		String strThree = "It is important that I want to be happy always";

		List<String> strOneArr = new ArrayList<>();
		List<String> strTwoArr = new ArrayList<>();
		List<String> strThreeArr = new ArrayList<>();

		List<String> result = new ArrayList<>();
	
		String subStr = "";
		String resultant ="";
		
		int jPointer;
		int temp = 0;
		int strLength = 0;
		int j = 0;
		int k = 0;
		int count = 0;
		int i = 0;

		while (j < strOne.length()) {
			subStr = "";
			while (j < strOne.length() && strOne.charAt(j) != ' ') {
				subStr = subStr + strOne.charAt(j);
				j++;
			}
			j++;
			strOneArr.add(subStr);
		}

		subStr = "";
		j = 0;

		while (j < strTwo.length()) {
			subStr = " ";
			while (j < strTwo.length() && strTwo.charAt(j) != ' ') {
				subStr = subStr + strTwo.charAt(j);
				j++;
			}
			j++;
			strTwoArr.add(subStr);
		}

		subStr = "";
		j = 0;

		while (j < strThree.length()) {
			subStr = " ";
			while (j < strThree.length() && strThree.charAt(j) != ' ') {
				subStr = subStr + strThree.charAt(j);
				j++;
			}
			j++;
			strThreeArr.add(subStr);
		}

		if (strOneArr.size() < strTwoArr.size()) {
			strLength = strOneArr.size();
			if (strOneArr.size() < strThreeArr.size()) {
				strLength = strOneArr.size();
			} else {
				strLength = strThreeArr.size();
			}
		} else {
			strLength = strTwoArr.size();
			if (strTwoArr.size() < strThreeArr.size()) {
				strLength = strTwoArr.size();
			} else {
				strLength = strThreeArr.size();
			}
		}

		j = 0;
		i = 0;

		while (i < strLength) {
			temp = i;
			jPointer = j;
			while (i < strLength && j < strLength && strOneArr.get(i).trim().equals(strTwoArr.get(j).trim())) {
				result.add(strOneArr.get(i));
				j++;
				i++;
			}
			i = temp + 1;
			j = j + 1;
		}
		
		j = 0;
		i = 0;
		while(i < result.size()) {
			temp = i;
			for(j = 0 ; j < strThreeArr.size() ; j++) {
				if(result.get(i).trim().equals(strThreeArr.get(j).trim())) {
					resultant = resultant + strThreeArr.get(j);
					count++;
					i++;
				}
			}
			if(count != 3) {
				resultant = "";
			}
			i++;
		}
		
		System.out.print(resultant.trim());
	}
}
