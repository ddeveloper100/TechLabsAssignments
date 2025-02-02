package com.aurionprohw;

import java.util.Scanner;

public class SubstringFinder {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the main string: ");
		String mainString = scanner.nextLine();

		System.out.print("Enter the substring to search: ");
		String subString = scanner.nextLine();

		if (mainString.contains(subString)) {
			System.out.println("The substring \"" + subString + "\" is found in the main string.");
		} else {
			System.out.println("The substring \"" + subString + "\" is not found in the main string.");
		}
	}
}
