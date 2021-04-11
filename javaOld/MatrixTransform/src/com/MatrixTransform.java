package com;

import java.util.*;

public class MatrixTransform {
	public static void main(String args[]) {

		Scanner obj = new Scanner(System.in);

		int row = 4, column = 4;
		int count = 0;
		int flag = 0;

		int[][] matOne = new int[row][column];
		int[][] matTwo = new int[row][column];

		int[][] resultantMat = new int[row][column];

		int rotate = 1;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matOne[i][j] = obj.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matTwo[i][j] = obj.nextInt();
			}
		}

		while (rotate != 5) {
			int l = 0;
			int k = 0;
			for (int i = row - 1; i >= 0; i--) {
				l = 0;
				for (int j = 0; j < column; j++) {
					resultantMat[l][k] = matOne[i][j];
					l++;
				}
				k++;
			}

			count = 0;
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					if (resultantMat[i][j] == matTwo[i][j]) {
						count++;
					}
				}
			}

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					matOne[i][j] = resultantMat[i][j];
				}
			}

			if (count == (row * row)) {
				System.out.print("True");
				flag = 1;
				break;
			} else {
				rotate++;
			}
		}

		if (flag == 0) {
			System.out.print("False");
		}

	}
}
