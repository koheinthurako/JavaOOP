package GameAssignment;

import java.util.Scanner;

public abstract class Game {

	private int score;
	private int count;
	private boolean checker;

	Scanner sc = new Scanner(System.in);

	public Game(int score, int count) {
		super();
		this.score = score;
		this.count = count;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public abstract boolean playGame(int selectedGame);

	public int increaseCount() {
		this.count++;
		return count;
	}

	public void showResult() {
		System.out.println("You played " + count + " : " + "you scored " + score);
	}

	public boolean continueOrNot() {
		System.out.print("Do you want to play again ? Y/N : ");
		String yesOrNo = sc.nextLine().toLowerCase();
		if (yesOrNo.equals("y")) {
			checker = true;
			return checker;
		} else {
			checker = false;
			showResult();
			return checker;
		}
	}

	@Override
	public String toString() {
		return "Game [score=" + score + ", count=" + count + "]";
	}

}
