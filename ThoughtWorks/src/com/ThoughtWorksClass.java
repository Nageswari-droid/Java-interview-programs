package com;

public class ThoughtWorksClass {
	public static void main(String args[]) {

		int num = 9;
		int iPointer = (num + 2) / 2;
		int diamondNum = 1;
		int jPointer = iPointer;
		int flag = 0;

		String[] result = new String[num + 2];

		for (int i = 0; i < num + 2; i++) {
			result[i] = " ";
		}

		for (int i = 0; i < (num + 2); i++) {

			if (i <= (num + 2) / 2) {
				int temp = iPointer;
				flag = 0;
				while (temp <= jPointer && flag == 0) {
					result[temp] = String.valueOf(diamondNum);
					diamondNum++;
					temp++;
					if (i == 0) {
						flag = 1;
					}
				}
				iPointer--;
				jPointer++;
			}
			else {
				if(i == ((num + 2) / 2) + 1) {
					iPointer = iPointer + 2;
					jPointer = jPointer - 2;
				}
				int temp = iPointer;
				while (temp <= jPointer) {
					result[temp] = String.valueOf(diamondNum);
					diamondNum++;
					temp++;
					if (i == 0) {
						flag = 1;
					}
				}
				iPointer++;
				jPointer--;
			}

			for (int k = 0; k < result.length; k++) {
				System.out.print(result[k] + "\t");
				result[k] = " ";
			}

			System.out.println(" ");
		}
	}
}

//		 1
//	  4  3  2
//   5  6  7  8  9
//10 11 12 13 14 15 16
//   17 18 19 20 21
//      22 23 24
//         25