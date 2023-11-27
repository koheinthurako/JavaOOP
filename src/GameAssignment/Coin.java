package GameAssignment;

import java.util.Scanner;

import java.util.Random;

public class Coin extends Game {

	Scanner sc = new Scanner(System.in);

	private int face = 2;
	private String head = "head of a coil";
	private String tail = "tail of a coil";

	public Coin(int score, int count) {
		super(score, count);
	}

	@Override
	public boolean playGame(int selectedGame) {
		Random r = new Random();
		boolean checker = true;

		System.out.println("Let's play coin game!");
		while (checker) {
			int randomCoin = r.nextInt(face) + 1;
			System.out.println("Tossing...Tossing...Tossing...");
			System.out.println("Guess What! head or tail?");
			System.out.println("1. Head 2. Tail");

			if (sc.hasNextInt()) {
				int input = sc.nextInt();
				if (input > face) {
					System.out.println("Wrong guess! Choose number 1 or 2");
					checker = super.continueOrNot();
				} else if (input == randomCoin) {
					if (input == 1) {
						System.out.println("Correct! It's " + head);
					} else {
						System.out.println("Correct! It's " + tail);
					}
					super.setScore(super.getScore() + 1);
					increaseCount();
					checker = super.continueOrNot();
				} else {
					increaseCount();
					if (randomCoin == 1) {
						System.out.println("Sorry! It's " + head);
					} else {
						System.out.println("Sorry! It's " + tail);
					}
					checker = super.continueOrNot();
				}
			} else {
				System.out.println("Invalid Values! Please enter numbers only!");
				checker = false;
			}

		}
		return true;
	}

	@Override
	public String toString() {
		return "Head=" + head + ", tail=" + tail;
	}

}
