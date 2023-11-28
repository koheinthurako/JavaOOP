package GameAssignment;

import java.util.Scanner;

import java.util.Random;

public class Dice extends Game {

	private int min = 1;
	private int max = 6;
	Scanner sc = new Scanner(System.in);

	public Dice(int score, int count) {
		super(score, count);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public boolean playGame() {
		Random r = new Random();
		boolean checker = true;

		System.out.println("Let's play dice game!");
		while (checker) {
			int randomDice = r.nextInt(max) + 1;
			System.out.println("Rolling...Rolling...Rolling...");
			System.out.print("Guess what : ");
			if (sc.hasNextInt()) {
				int input = sc.nextInt();
				if (input > max) {
					System.out.println("Wrong guess! Dice numbers are between 1 to 6");
					checker = super.continueOrNot();
				} else if (input == randomDice) {
					System.out.println("Correct! It's " + randomDice);
					super.setScore(super.getScore() + 1);
					increaseCount();
					checker = super.continueOrNot();
				} else {
					increaseCount();
					System.out.println("Sorry! It's " + randomDice);
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
		return "Dice [min=" + min + ", max=" + max + "]";
	}

}
