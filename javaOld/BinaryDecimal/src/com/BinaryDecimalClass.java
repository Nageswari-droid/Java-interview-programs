package com;

public class BinaryDecimalClass {
	public static void main(String args[]) {
		int num = 33;
		
		while (num != 0) 
        { 
            int temp = num, m = 0, p = 1; 
            while(temp != 0) 
            { 
                int rem = temp % 10; 
                temp = temp / 10; 
  
                if (rem != 0) {
                    m = m + p; 
                }
                p = p * 10; 
            } 
            System.out.print(m + " ");
            num = num - m; 
        } 
        System.out.println(" "); 
	}
}
