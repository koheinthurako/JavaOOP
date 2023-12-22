package IQGame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AgeGame implements GameControl {

	int age;
	int dif_age;
	int correctAnswer;
	String question;
	Map<Character, Integer> multipleBox = new HashMap<>();

	public AgeGame() {
		age = ConstDatas.RANDOM.nextInt(100);
		do {
			dif_age = ConstDatas.RANDOM.nextInt(ConstDatas.SKIP_COUNT) + 2;
		} while (dif_age % 2 != 0);
		this.correctAnswer = age + (dif_age/2);
	}

	@Override
	public String generateQuestions() {
		question = "I am currently " + age + " years old, and my age is exactly half of my brother's age when he was "
				+ dif_age + " years old. How old is my brother?";
		return question;
	}

	@Override
	public void showQuestions() {
		System.out.println(generateQuestions());
		showAnswer();
		requestUserInput();
		System.out.println(nextProblem());
	}

	@Override
	public void generateAnswer() {
		int num = 0;
		int cor_position = ConstDatas.RANDOM.nextInt(4);
		do {
			if (multipleBox.size() == cor_position) {
				multipleBox.put((char) (num + 'a'), correctAnswer);
			} else {
				int choice = ConstDatas.RANDOM.nextInt(correctAnswer) + ConstDatas.ANS_RANGE;
				if (choice > (correctAnswer - ConstDatas.ANS_RANGE) | choice < correctAnswer + ConstDatas.ANS_RANGE) {
					multipleBox.put((char) (num + 'a'), choice);
				}
			}
			num++;
		} while (multipleBox.size() != 4);
	}

	public Map<Character, Integer> showAnswer() {
		generateAnswer();
		Set<Entry<Character, Integer>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			System.out.print(entry.getKey() + ")" + entry.getValue()+ConstDatas.SPACING);
		}
		System.out.println("");
		return multipleBox;
	}

	@Override
	public void requestUserInput() {
		System.out.print("Enter your answer : ");
		while(true) {
			try {
				String input = ConstDatas.sc.nextLine();
				checkInput(input);
				break;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.print("Enter your answer : ");
			}
		}
	}
	
	public void checkInput(String input) {
		Set<Entry<Character, Integer>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		boolean invalidInput = true;
		while(it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			if(input.charAt(0)==entry.getKey()) {
				if(correctAnswer==entry.getValue()) Player.winCount++;
				invalidInput = false;
				return;
			} else {
				invalidInput = true;
			}
		}
		
		if(invalidInput) {
			requestUserInput();
		}
	}

	@Override
	public String nextProblem() {
		return "--------------------------------------------";
	}

}
