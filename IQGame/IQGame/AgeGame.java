package IQGame;

public class AgeGame implements GameControl {

	int age;
	int dif_age;
	int correctAnswer;
	String question;

	public AgeGame() {
		age = ConstDatas.RANDOM.nextInt(100);
		do {
			dif_age = ConstDatas.RANDOM.nextInt(ConstDatas.SKIP_COUNT) + 2;
		} while (dif_age % 2 != 0);
		Answer.CORRECT_ANSWER = age + (dif_age / 2);
	}

	@Override
	public String generateQuestions() {
		question = "II). I am currently " + age + " years old, and my age is exactly half of my brother's age when he was "
				+ dif_age + " years old. How old is my brother?";
		return question;
	}

	@Override
	public void showQuestions() {
		System.out.println(generateQuestions());
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
