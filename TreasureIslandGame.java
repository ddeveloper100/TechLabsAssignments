package com.aurionpro;

import java.util.Scanner;

public class TreasureIslandGame {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");

		System.out.println("Left or Right?");

		String move1 = scanner.nextLine();

		if (!move1.equalsIgnoreCase("Left")) {
			System.out.println("Fall into a hole. Game Over.");
			System.exit(0);
		}

		System.out.println("Swim or Wait");

		String move2 = scanner.nextLine();

		if (!move2.equalsIgnoreCase("Wait")) {
			System.out.println("Attack by trout. Game Over.");
			System.exit(0);
		}

		System.out.println("Which door? Red, Blue or Yellow");

		String move3 = scanner.nextLine();

		if (move3.equalsIgnoreCase("Red")) {
			System.out.println("Burned by fire. Game Over.");
			System.exit(0);
		} else if (move3.equalsIgnoreCase("Blue")) {
			System.out.println("Eaten by beasts. Game Over.");
			System.exit(0);
		} else {
			System.out.println("You Win!");
		}

	}
}
