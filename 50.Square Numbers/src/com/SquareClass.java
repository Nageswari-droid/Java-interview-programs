package com;

public class SquareClass {
	public static void main(String args[]) {
		int start = 9, stop =100;
		
		int startSqrt = (int)Math.ceil(Math.sqrt(start));;
		int stopSqrt = (int)Math.floor(Math.sqrt(stop));;
		
		for(int i = startSqrt; i <= stopSqrt ; i++) {
			System.out.print((i * i) + " ");
		}
	}
}
