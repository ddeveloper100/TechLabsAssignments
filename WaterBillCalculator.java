package com.aurionpro;

import java.util.Scanner;

public class WaterBillCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int meterCharge = 75;

		System.out.println("Enter the number of units consumed:");
		int numberOfUnits = scanner.nextInt();
		int charge;

		if (numberOfUnits <= 100) {
			charge = numberOfUnits * 5;
		} else if (numberOfUnits <= 250) {
			charge = numberOfUnits * 10;
		} else {
			charge = numberOfUnits * 20;
		}

		int totalWaterBill = charge + meterCharge;

		System.out.println("The total water bill is " + totalWaterBill);
	}
}
