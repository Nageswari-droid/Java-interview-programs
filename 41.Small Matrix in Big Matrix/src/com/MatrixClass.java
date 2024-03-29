package com;

import java.util.*;

public class MatrixClass {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int bigRow = 3, bigColumn = 3;
		int smallRow = 2, smallColumn = 2;
		int count = 0;
		int flag = 0;
		int tempI = 0, tempJ = 0;

		int[][] biggerMat = new int[bigRow][bigColumn];
		int[][] smallerMat = new int[smallRow][smallColumn];

		for (int i = 0; i < bigRow; i++) {
			for (int j = 0; j < bigColumn; j++) {
				biggerMat[i][j] = obj.nextInt();
			}
		}

		for (int i = 0; i < smallRow; i++) {
			for (int j = 0; j < smallColumn; j++) {
				smallerMat[i][j] = obj.nextInt();
			}
		}

		for (int i = 0; i < bigRow; i++) {
			for (int j = 0; j < bigColumn; j++) {
				tempI = i;
				tempJ = j;
				count = 0;
				int l = 0, k = 0;
				if (tempJ != bigColumn - 1  && tempI != bigRow -1) {
					while (biggerMat[tempI][tempJ] == smallerMat[l][k] && count < (smallRow * smallRow)) {
						
						count++;

						if (k < smallRow - 1) {
							k++;
							tempJ++;
						} else if (k == 1) {
							tempI++;
							tempJ = j;
							k = 0;
							l++;
						}
						if (count == smallRow * smallRow) {
							flag = 1;
							break;
						}

					}

					if (count == smallRow * smallRow) {
						flag = 1;
						break;
					} else {
						count = 0;
					}
				}
			}
			if (count == smallRow * smallRow) {
				flag = 1;
				break;
			} else {
				count = 0;
			}
		}

		if (flag == 1)
			System.out.print("TRUE");
		else
			System.out.print("FALSE");
	}

}
