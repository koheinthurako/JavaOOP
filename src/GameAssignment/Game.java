package GameAssignment;

public class Game {

	private int score;
	private int count;

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
	
	public boolean playGame(int chooseGame) {
		
		return false;
	}
	
	public int increaseCount() {
		
		return 0;
	}

	@Override
	public String toString() {
		return "Game [score=" + score + ", count=" + count + "]";
	}

}
