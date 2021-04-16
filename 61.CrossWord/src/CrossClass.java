import java.util.Scanner;

public class CrossClass {
	public static void main(String args[]) {
		char mat[][] = { { 'A', 'B', 'c', 'g', 'E' }, { 'Z', 'o', 'F', 'o', 'E' }, { 'o', 'H', 'w', 'd', 'W' },
				{ 'h', 'Q', 'B', 'o', 'W' }, { 'O', 'T', 'H', 'E', 'w' } };

		Scanner obj = new Scanner(System.in);
		String str = obj.next();

		int num = 5;
		int k = 0;
		int count = 0;
		int flag = 0;

		int resultI = 0;
		int resultJ = 0;

		for (int i = 0; i < num; i++) {
			k = 0;
			for (int j = 0; j < num; j++) {
				if (Character.toLowerCase(mat[i][j]) == Character.toLowerCase(str.charAt(k))) {
					int startI = i;
					int startJ = j;
					int temp = j;
					int tempI = i;
					int jIndex = j + 1;
					k++;
					count++;
					while (i < num && jIndex < num
							&& Character.toLowerCase(mat[i][jIndex]) == Character.toLowerCase(str.charAt(k))) {
						jIndex++;
						k++;
						count++;

						if (count == str.length()) {
							resultI = startI;
							resultJ = startJ;
							flag = 1;
							break;
						}
					}

					count = 1;
					k = 1;
					int iIndex = tempI + 1;
					jIndex = temp;

					while (iIndex < num && jIndex < num
							&& Character.toLowerCase(mat[iIndex][jIndex]) == Character.toLowerCase(str.charAt(k))) {
						iIndex++;
						k++;
						count++;

						if (count == str.length()) {
							resultI = startI;
							resultJ = startJ;
							flag = 1;
							break;
						}
					}

					count = 1;
					k = 1;
					iIndex = tempI + 1;
					jIndex = temp + 1;

					while (iIndex < num && jIndex < num
							&& Character.toLowerCase(mat[iIndex][jIndex]) == Character.toLowerCase(str.charAt(k))) {
						iIndex++;
						jIndex++;
						k++;
						count++;

						if (count == str.length()) {
							resultI = startI;
							resultJ = startJ;
							flag = 1;
							break;
						}
					}
				}

				if (flag == 1) {
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}

		System.out.print("Got " + str + " at " + resultI + " , " + (resultJ));
	}
}
