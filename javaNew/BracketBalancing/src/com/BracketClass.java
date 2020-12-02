package com;

import java.util.*;

public class BracketClass {
	public static void main(String args[]) {

		String input = "{()}]]";
		int i = 0;

		Stack<Character> stk = new Stack<>();
		Stack<Character> closeBracket = new Stack<>();

		while (i < input.length()) {
			while (i < input.length() && (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(')) {
				stk.add(input.charAt(i));
				i++;
			}

			while (i < input.length() && (!stk.isEmpty())
					&& (input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')')) {
				if (input.charAt(i) == '}' && stk.peek() == '{') {
					stk.pop();
					i++;
				} else if (input.charAt(i) == ']' && stk.peek() == '[') {
					stk.pop();
					i++;
				} else if (input.charAt(i) == ')' && stk.peek() == '(') {
					stk.pop();
					i++;
				} else {
					closeBracket.add(input.charAt(i));
					i++;
					break;
				}
			}

			if ((stk.isEmpty()) && i < input.length()
					&& (input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')')) {
				closeBracket.add(input.charAt(i));
				i++;
			}
		}

		if (stk.isEmpty() && closeBracket.isEmpty()) {
			System.out.print("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}
}
