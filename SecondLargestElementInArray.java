package com.arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {
	public static int getSecondLargestNumber(int[] array) {
		if (array == null || array.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No second largest element found");
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		if (n < 2) {
			System.out.println("Array must have at least two elements");
			return;
		}

		int[] array = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Second Largest Number: " + getSecondLargestNumber(array));
	}
}