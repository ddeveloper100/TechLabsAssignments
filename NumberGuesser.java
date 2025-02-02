package com.aurionprohw;

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String playAgain = "Yes";

		while (playAgain.equalsIgnoreCase("Yes")) {
			int targetNumber = random.nextInt(100) + 1;
			int attempts = 0;
			boolean guessedCorrectly = false;
			System.out.println("Random number generated!");

			while (attempts < 5) {
				System.out.print("Guess a number? ");
				int guess = scanner.nextInt();
				attempts++;

				if (guess < targetNumber) {
					System.out.println("Sorry, Too Low");
				} else if (guess > targetNumber) {
					System.out.println("Sorry, Too High");
				} else {
					System.out.println("You won in attempt: " + attempts);
					guessedCorrectly = true;
					break;
				}
			}

			if (!guessedCorrectly) {
				System.out.println("Game over! The correct number was: " + targetNumber);
			}

			System.out.print("Do you want to play the game again? yes or no? ");
			scanner.nextLine();
			String response = scanner.nextLine();
			playAgain = response;
		}

		System.out.println("Thankyou for playing!");
	}
}
