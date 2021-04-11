package removeFrndsStk;

import java.util.*;

public class removeStk {
	public static void main(String args[]) {
		Stack<Integer> stk = new Stack<>();
		Stack<Integer> resultStk = new Stack<>();
		int[] arr = { 3, 100, 1 };
		int k = 1;

		for (int i = 0; i < arr.length; i++) {
			while (!stk.isEmpty() && k != 0) {
				if (stk.peek() < arr[i]) {
					stk.pop();
					k--;
				} else {
					break;
				}
			}

			stk.push(arr[i]);
		}

		while (!stk.isEmpty()) {
			resultStk.push(stk.pop());
		}

		while (!resultStk.isEmpty()) {
			System.out.print(resultStk.pop() + " ");
		}
	}
}
