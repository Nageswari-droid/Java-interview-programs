package com;

public class MatrixEdgeClass {
	public static void main(String args[]) {
		int row = 4;
		int column = 3;

		int[][] mat = { { 10, 25, 14 }, { 12, 28, 14 }, { 21, 26, 18 }, { 7, 8, 9 } };

		int[][] resultMat = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == row - 1 || j == column - 1) {
					resultMat[i][j] = (mat[i][j] * 2);
				} else {
					resultMat[i][j] = (mat[i][j] / 2);
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(resultMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
