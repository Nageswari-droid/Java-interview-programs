package binaryNumberscom;

import java.util.*;

public class BinaryClass {
	public static void main(String args[]) {
		int numOne = 11011111;
		int numTwo = 111000;
		int carryOver = 0;
		int sum;
		int j = 0;
		char appendZero = '0';
		
		int eleOne, eleTwo;
		
		String strOne = String.valueOf(numOne);
		String strTwo = String.valueOf(numTwo);
		
		String resultStr = "";
		
		int length = (strOne.length() > strTwo.length()) ? strOne.length() : strTwo.length();
		
		List<Integer> resultant = new ArrayList<>();
		
		while(length != strOne.length()) {
			strOne = appendZero + strOne;
			if(strOne.length() == length) {
				break;
			}
		}
		while(length != strTwo.length()) {
			strTwo = appendZero + strTwo;
			if(strTwo.length() == length) {
				break;
			}
		}
		
		for(int i = length - 1 ; i >= 0 ; i--) {
			
			eleOne = Integer.parseInt(String.valueOf(strOne.charAt(i)));
			eleTwo = Integer.parseInt(String.valueOf(strTwo.charAt(i)));
			
			sum = eleOne + eleTwo + carryOver;
			
			if(sum == 2) {
				resultant.add(j, 0);
				carryOver = 1;
			}
			else if(sum == 3) {
				resultant.add(j, 1);
				carryOver = 1;
			}
			else {
				resultant.add(j, sum);
				carryOver = 0;
			}

			j++;
		}
		
		resultStr = (carryOver == 1 ? "1" : ""); 
		
		for(int i = resultant.size() - 1 ; i >= 0 ; i--) {
			resultStr = String.valueOf(resultStr + resultant.get(i));
		}
		
		System.out.print(resultStr);
	}
}
