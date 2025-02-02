package com.aurionprohw;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows of first matrix: ");
		int rows1 = scanner.nextInt();
		System.out.print("Enter the number of columns of first matrix: ");
		int columns1 = scanner.nextInt();

		System.out.print("Enter the number of rows of second matrix: ");
		int rows2 = scanner.nextInt();
		System.out.print("Enter the number of columns of second matrix: ");
		int columns2 = scanner.nextInt();

		if (columns1 != rows2) {
			System.out.println("Matrix multiplication is not possible.");
			return;
		}

		int[][] matrix1 = new int[rows1][columns1];
		int[][] matrix2 = new int[rows2][columns2];
		int[][] result = new int[rows1][columns2];

		System.out.println("Enter elements of first matrix:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter elements of second matrix:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				int sum = 0;
				for (int k = 0; k < columns1; k++) {
					sum = sum + (matrix1[i][k] * matrix2[k][j]);
				}
				result[i][j] = sum;
			}
		}

		System.out.println("Resultant matrix:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}
