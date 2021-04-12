import java.util.*;

public class MaxMinCharClass {
	public static void main(String args[]) {

		ArrayList<Character> maxList = new ArrayList<>();
		ArrayList<Character> minList = new ArrayList<>();

		String str = "cocacola";
		char maxChar = ' ';
		char minChar = ' ';

		int maxCount = 1;
		int minCount = 0;

		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			if (!maxList.contains(str.charAt(i))) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}

				if (maxCount < count) {
					maxCount = count;
					maxChar = str.charAt(i);
				}
			}

			maxList.add(str.charAt(i));
		}

		minCount = maxCount;

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			if (!minList.contains(str.charAt(i))) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}

				if (minCount > count) {
					minCount = count;
					minChar = str.charAt(i);
				}
			}

			minList.add(str.charAt(i));
		}

		System.out.println(maxChar + " " + maxCount);
		System.out.println(minChar + " " + minCount);
	}
}
