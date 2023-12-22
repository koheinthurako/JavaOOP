package IQGame;

public class FibonacciGame implements GameControl {

	int start;
	int end;
	String question;
	int correctAnswer;

	public FibonacciGame() {
		start = ConstDatas.RANDOM.nextInt(ConstDatas.INITIAL_NUMBER_RANGE) + 1;
		end = ConstDatas.RANDOM.nextInt(ConstDatas.SKIP_COUNT) + 2;
	}

	@Override
	public String generateQuestions() {
		question = "III). " + (start + ConstDatas.SPACING);
		int buffer = start + end;
		int previous = 0;
		for (int i = 0; i < 4; i++) {
			if (i < 3)
				question += buffer + ConstDatas.SPACING;
			else
				Answer.CORRECT_ANSWER = buffer;
			previous = buffer;
			buffer += start;
			start = previous;
		}
		return question;
	}

	@Override
	public void showQuestions() {
		System.out.println(generateQuestions() + "(-------)");
		Answer.showAnswer();
		Player.requestUserInput();
		System.out.println(nextProblem());
	}

	@Override
	public String nextProblem() {
		Answer.multipleBox.clear();
		return "____________________________________________\n";
	}

}
