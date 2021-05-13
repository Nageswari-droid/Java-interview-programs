package swayamvarTcs;

import java.util.*;
import java.io.*;

public class swayamvarTcs {
	public static void main(String args[]) throws Exception {
		int numOfInput;
		String bridesString, groomsString;

		Queue<Character> bridesQueue = new LinkedList<>();
		Queue<Character> groomsQueue = new LinkedList<>();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter input:");
		numOfInput = input.nextInt();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Brides:");

		bridesString = br.readLine();
		char[] brideArray = bridesString.toCharArray();

		System.out.print("Grooms:");

		groomsString = br.readLine();
		char[] groomArray = groomsString.toCharArray();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numOfInput; i++) {
			bridesQueue.add(brideArray[i]);
			groomsQueue.add(groomArray[i]);
		}

		int lengthValue = 0;
		int result = 0;

		for (int i = 0; i < numOfInput * numOfInput ; i++) {

			if (!bridesQueue.isEmpty() && !groomsQueue.isEmpty()) {
				char groomChar = groomsQueue.peek();
				char bridesChar = bridesQueue.peek();

				if (bridesChar == groomChar) {
					lengthValue++;
					bridesQueue.poll();
					groomsQueue.poll();
				} else {
					groomChar = groomsQueue.poll();
					groomsQueue.add(groomChar);

				}

			} else {
				break;
			}
		}

		result = numOfInput - lengthValue;
		System.out.println(result);

		br.close();

	}
}

/*
Brides:rrrrrrrrrrrrrrrrrrrrmmmmmmmmmmmmmmmmmmmm
Grooms:mmmmmmmmmmmmmmmmmmmmrrrrrrrrrrrrrrrrrrrrr
 */
