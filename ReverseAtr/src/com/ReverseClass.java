package com;

public class ReverseClass {
	public static void main(String args[]) {
		String strVal = "A man, in the boat says : I see 1-2-3 in the sky";
		
		char[] charArr = strVal.toCharArray();
		char[] resultant = new char[charArr.length];
		
		for(int i = 0 ; i < resultant.length ; i++) {
			if(charArr[i] >= 32 && charArr[i] <= 47 || charArr[i] >= 58 && charArr[i] <= 64 || charArr[i] >= 91 && charArr[i] <= 96) {
				resultant[i] = charArr[i];
			}
		}
		
		int j = resultant.length - 1;  
		   
        for (int i = 0; i < charArr.length; i++) {  
            if (charArr[i] >= 65 && charArr[i] <= 90 || charArr[i] >= 97 && charArr[i] <= 122 || charArr[i] >= 48 && charArr[i] <= 57) {  
            	if(resultant[i] >= 32 && resultant[i] <= 47 || resultant[i] >= 58 && resultant[i] <= 64 || resultant[i] >= 91 && resultant[i] <= 96) {  
                    j--;  
                }  
                resultant[j] = charArr[i];  
                j--;  
            }  
        }  
        
        for(int i = 0 ; i < resultant.length ; i++) {
        	System.out.print(resultant[i]);
        }
	}
}
