package com;

public class DecimalToRomanClass {
	public static void main(String args[]) {
		int num = 14;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			
			num = num / 10;
		}
	}
	
	public static char charValue(int num) {
		switch(num) {
		case 1:{
			return 'I';
		}
		case 5:{
			return 'V';
		}
		case 10:{
			return 'X';
		}
		case 50:{
			return 'L';
		}
		case 100:{
			return 'C';
		}
		case 1000:{
			return 'M';
		}
		default:
			return ' ';
		}
	}
}
