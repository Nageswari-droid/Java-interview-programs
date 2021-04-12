package com;

public class CharacterClass {
	public static void main(String args[]) {
		int num = 101;
		int count = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			
			int temp = i;
			int rem = 0;
			
			while(temp != 0) {
				rem = temp % 10;
				count++;
				temp = temp / 10;
			}
		}
		
		System.out.print(count);
	}
}
