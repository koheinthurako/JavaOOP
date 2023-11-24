package GameAssignment;

public class Dice extends Game {

	private int min;
	private int max;

	public Dice(int score, int count, int min, int max) {
		super(score, count);
		this.min = min;
		this.max =  max;
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
	public boolean playGame(int chooseGame) {
		
		return false;
	}

	@Override
	public String toString() {
		return "Dice [min=" + min + ", max=" + max + "]";
	}

}
