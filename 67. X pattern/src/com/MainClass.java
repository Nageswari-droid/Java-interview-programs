package com;

public class MainClass {
	public static void main(String[] args) {
		String str = "welcometozoho";

		String[] resultant = new String[str.length()];

		for (int i = 0; i < resultant.length; i++) {
			resultant[i] = " ";
		}

		int i = 0;
		int j = resultant.length - 1;

//		String[] strArr = str.split("");
//		System.out.println(strArr);

		while (i < resultant.length && j >= 0) {
			resultant[i] = Character.toString(str.charAt(i));
			resultant[j] = Character.toString(str.charAt(j));
			i++;
			j--;

			for (int k = 0; k < resultant.length; k++) {
				System.out.print(resultant[k]);
				resultant[k] = " ";
			}
			System.out.println();
		}
	}
}
