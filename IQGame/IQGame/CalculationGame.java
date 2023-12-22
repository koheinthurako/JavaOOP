package IQGame;

public class CalculationGame implements GameControl {

	int start;
	int end;
	String question;

	public CalculationGame() {
		start = ConstDatas.RANDOM.nextInt(100) + 1;
		end = ConstDatas.RANDOM.nextInt(100) + 1;
	}

	@Override
	public String generateQuestions() {
		int calculation = ConstDatas.RANDOM.nextInt(2);
		if (calculation == 0) {
			int total = start + end;
			question = " + " + end + " = " + total;
		} else {
			int total = start - end;
			question = " - " + end + " = " + total;
		}
		Answer.CORRECT_ANSWER = start;
		return question;
	}

	@Override
	public void showQuestions() {
		System.out.println("(-------)" + generateQuestions());
		Answer.showAnswer();
		Player.requestUserInput();
		System.out.println(nextProblem());
	}

	@Override
	public String nextProblem() {
		Answer.multipleBox.clear();
		return "--------------------------------------------";
	}

}
