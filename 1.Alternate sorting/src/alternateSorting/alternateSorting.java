package alternateSorting;

import java.util.*;

public class alternateSorting {
	public static void main(String args[]) {
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7 };
		int[] dummyArray = new int[numArray.length];

		int i = 0, j = numArray.length - 1;

		for (int k = 0; k < dummyArray.length; k = k + 2) {

			Arrays.sort(numArray);

			dummyArray[k] = numArray[j];
			System.out.print(dummyArray[k] + " ");
			if (k + 1 < dummyArray.length) {
				dummyArray[k + 1] = numArray[i];
				System.out.print(dummyArray[k + 1] + " ");
			}

			numArray[i] = -1;
			numArray[j] = -1;

			i = i + 2;
			j = numArray.length - 1;

		}

	}
}

//Input  : {1, 2, 3, 4, 5, 6, 7}
//Output : {7, 1, 6, 2, 5, 3, 4} 



