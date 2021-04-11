package com;

import java.util.*;

public class PermutationClass {
	public static void main(String args[]) {
		String str = "ABC";

		String result = "A B C D AB AC AD BC BA CA DA CB ABCD ABDC ACDB ACBD ADCB ADBC BCDA BCAD BDCA BDAC BADC BACD CDAB CDBA CBDA CBAD CADB CABD DABC DACB DCBA DCAB DBCA DBAC";

		System.out.println(result.split(" ").length);

		String[] alphaArray = str.split("");

		for (int i = 0; i < alphaArray.length; i++) {
			
		}
	}
}
