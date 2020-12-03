package com;

public class MatrixEdgeClass {
	public static void main(String args[]) {
		int row = 3;
		int column = 3;

		int[][] mat = { { 10, 5, 4 }, { 12, 8, 14 }, { 1, 3, 18 } };

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
