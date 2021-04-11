package com;

public class StringRotationClass {

    static boolean areRotations(String str1, String str2) 
    { 
    	System.out.println(str1+ str1);
        return (str1.length() == str2.length()) &&  
               ((str1 + str1).contains(str2)); 
    } 
    
	public static void main(String args[]) {   
        String str1 = "Hello world here"; 
        String str2 = "erHello world he"; 
  
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    
		
	}
}
