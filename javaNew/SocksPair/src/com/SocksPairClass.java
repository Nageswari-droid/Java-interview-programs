package com;

public class SocksPairClass {
	public static void main(String args[]) {
		
		String input = "RGRBRG";
		String pair = "";
		String result = "";
		
		int redCount = 2;
		int greenCount = 2;
		int blueCount = 2;
		
		for(int i = 0 ; i < input.length() ; i = i + 2) {
			pair = "";
			pair = pair + input.charAt(i) + input.charAt(i + 1);
			if(i < input.length() && (redCount > 0 && greenCount > 0 && blueCount > 0)) {
				
				if(pair.equals("RG") || pair.equals("GR")) {
					redCount--;
					greenCount--;
				}
				else if(pair.equals("RB") || pair.equals("BR")) {
					redCount--;
					blueCount--;
				}
				else if(pair.equals("GB") || pair.equals("BG")) {
					blueCount--;
					greenCount--;
				}
			}
			else {
				result = result + pair;
			}
		}
		
		if(result.length() != 0) {
			System.out.print("False");
		}
		else {
			System.out.print("True");
		}
	}
}
