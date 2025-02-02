package com.aurionprohw;
import java.util.Arrays;
import java.util.Scanner;

public class SortedSquares {
	public static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int left = 0, right = n - 1;
		int index = n - 1;

		while (left <= right) {
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			if (leftSquare > rightSquare) {
				result[index] = leftSquare;
				left++;
			} else {
				result[index] = rightSquare;
				right--;
			}
			index--;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of the sorted array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("Sorted squares: " + Arrays.toString(sortedSquares(arr)));
	}
}
