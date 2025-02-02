package com.aurionprohw;

import java.util.Scanner;

public class RideBillCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your height in centimeters");
		int height = scanner.nextInt();

		if (height > 120) {
			System.out.println("Can ride");
		} else {
			System.out.println("Can't ride");
			System.exit(0);
		}

		int cost1 = 0;
		System.out.println("What is your age?");
		int age = scanner.nextInt();

		if (age < 12) {
			System.out.println("+$5");
			cost1 = 5;
		} else if (age > 12 && age < 18) {
			System.out.println("+$7");
			cost1 = 7;
		} else {
			if (age >= 45 && age <= 55) {
				System.out.println("+$0");
			} else if (age >= 18) {
				System.out.println("+$12");
				cost1 = 12;
			}
		}

		int cost2 = 0;
		System.out.println("Do you want photos?");
		scanner.nextLine(); // This is used to remove the buffer newline character "/n"
		String response = scanner.nextLine();

		if (response.equalsIgnoreCase("Yes")) {
			System.out.println("+$3");
			cost2 = 3;
		} else if (response.equalsIgnoreCase("No")) {
			System.out.println("No extra cost");
		}

		int totalBill = cost1 + cost2;

		System.out.println("The total bill is $" + totalBill);

	}
}
