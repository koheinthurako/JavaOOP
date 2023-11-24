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
	public boolean playGame(int selectedGame) {
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
					System.out.print("Do you want to play again ? Y/N : ");
					sc.nextLine();
					String yesOrNo = sc.nextLine().toLowerCase();
					if (yesOrNo.equals("y")) {
						checker = true;
					} else {
						checker = false;
						super.showResult();
					}
				} else if (input == randomDice) {
					System.out.println("Correct! It's " + randomDice);
					super.setScore(super.getScore() + 1);
					super.setCount(super.getCount() + 1);
					System.out.print("Do you want to play again ? Y/N : ");
					sc.nextLine();
					String yesOrNo = sc.nextLine().toLowerCase();
					if (yesOrNo.equals("y")) {
						checker = true;
					} else {
						checker = false;
						super.showResult();
					}
				} else {
					super.setCount(super.getCount() + 1);
					System.out.println("Sorry! It's " + randomDice);
					System.out.print("Do you want to play again ? Y/N : ");
					sc.nextLine();
					String yesOrNo = sc.nextLine().toLowerCase();
					if (yesOrNo.equals("y")) {
						checker = true;
					} else {
						checker = false;
						super.showResult();
					}
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
