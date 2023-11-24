package GameAssignment;
import java.util.Scanner;

import java.util.Random;

public class Coin extends Game {
	
	Scanner sc = new Scanner(System.in);

	private int face = 2;
	private String head = "Head of a coil";
	private String tail = "Tail of a coil";

	public Coin(int score, int count) {
		super(score, count);
	}

	@Override
	public boolean playGame(int selectedGame) {
		Random r = new Random();
		boolean checker = true;
		
		System.out.println("Let's play coin game!");
		while (checker) {
			int randomDice = r.nextInt(face) + 1;
			System.out.println("Rolling...Rolling...Rolling...");
			System.out.print("Guess what : ");
			if (sc.hasNextInt()) {
				if (sc.nextInt() == randomDice) {
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
				System.out.println("Invalid Values! Plesae enter numbers only!");
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
