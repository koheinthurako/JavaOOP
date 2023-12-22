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
		question = start + ConstDatas.SPACING;
		int buffer = start + end;
		int previous = 0;
		for (int i = 0; i < 4; i++) {
			if (i < 3)
				question += buffer + ConstDatas.SPACING;
//			else correctAnswer = buffer;
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
//		showAnswer();
		Answer.showAnswer();
//		requestUserInput();
		Player.requestUserInput();
		System.out.println(nextProblem());
	}

//	@Override
//	public void generateAnswer() {
//		int num = 0;
//		int cor_position = ConstDatas.RANDOM.nextInt(4);
//		do {
//			if (multipleBox.size() == cor_position) {
//				multipleBox.put((char) (num + 'a'), correctAnswer);
//			} else {
//				int choice = ConstDatas.RANDOM.nextInt(correctAnswer) + ConstDatas.ANS_RANGE;
//				if (choice > (correctAnswer - ConstDatas.ANS_RANGE) | choice < correctAnswer + ConstDatas.ANS_RANGE) {
//					multipleBox.put((char) (num + 'a'), choice);
//				}
//			}
//			num++;
//		} while (multipleBox.size() != 4);
//	}
//	
//	public Map<Character, Integer> showAnswer() {
//		generateAnswer();
//		Set<Entry<Character, Integer>> set = multipleBox.entrySet();
//		Iterator<Entry<Character, Integer>> it = set.iterator();
//		while(it.hasNext()) {
//			Entry<Character, Integer> entry = it.next();
//			System.out.print(entry.getKey() + ")" + entry.getValue()+ConstDatas.SPACING);
//		}
//		System.out.println("");
//		return multipleBox;
//	}

//	@Override
//	public void requestUserInput() {
//		System.out.print("Enter your answer : ");
//		while(true) {
//			try {
//				String input = ConstDatas.sc.nextLine();
//				checkInput(input);
//				break;
//			} catch (StringIndexOutOfBoundsException e) {
//				System.out.print("Enter your answer : ");
//			}
//		}
//	}
//	
//	public void checkInput(String input) {
//		Set<Entry<Character, Integer>> set = Answer.multipleBox.entrySet();
//		Iterator<Entry<Character, Integer>> it = set.iterator();
//		boolean invalidInput = true;
//		while(it.hasNext()) {
//			Entry<Character, Integer> entry = it.next();
//			if(input.charAt(0)==entry.getKey()) {
//				if(Answer.CORRECT_ANSWER==entry.getValue()) Player.winCount++;
//				invalidInput = false;
//				return;
//			} else {
//				invalidInput = true;
//			}
//		}
//		
//		if(invalidInput) {
//			requestUserInput();
//		}
//	}

	@Override
	public String nextProblem() {
		Answer.multipleBox.clear();
		return "--------------------------------------------";
	}

}
