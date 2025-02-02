package com.aurionprohw;

import java.util.Scanner;
import java.util.Random;

public class PIGGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int totalScore = 0;
		int turnScore = 0;
		int turnCount = 0;

		while (totalScore < 20) {
			turnCount++;
			turnScore = 0;
			System.out.println("TURN " + turnCount);

			while (true) {
				System.out.print("Roll or hold? (r/h): ");
				String choice = scanner.nextLine();

				if (choice.equalsIgnoreCase("r")) {
					int die = random.nextInt(6) + 1;
					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("Turn over. No score.");
						break;
					} else {
						turnScore = turnScore + die;
					}
				} else if (choice.equalsIgnoreCase("h")) {
					System.out.println("Score for turn: " + turnScore);
					totalScore += turnScore;
					System.out.println("Total score: " + totalScore);
					break;
				} else {
					System.out.println("Invalid input. Please enter 'r' or 'h'.");
				}

				if (totalScore >= 20) {
					break;
				}
			}
		}

		System.out.println("\nYou finished in " + turnCount + " turns! Game Over!");
	}
}
