package IQGame;

public class SkipNumberGame implements GameControl{
	
	int start;
	String question;
	
	public SkipNumberGame() {
		start = ConstDatas.RANDOM.nextInt(50) + 1;
	}

	@Override
	public String generateQuestions() {
		question = start + ConstDatas.SPACING;
		for (int i = 0; i < 4; i++) {
			start++;
			if(i<3) {
				question += (ConstDatas.RANDOM.nextInt(50) + 1) + ConstDatas .SPACING;
				question += start + ConstDatas.SPACING;
			} else {
				question += (ConstDatas.RANDOM.nextInt(50) + 1) + ConstDatas .SPACING;
				Answer.CORRECT_ANSWER = start;
			}
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
		return "--------------------------------------------";
	}
	
	

}
