package IQGame;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AlphabeticGame implements GameControl{

	int start;
	int end;
	String question;
	char correctAnswer;
	Map<Character, Character> multipleBox = new LinkedHashMap<Character, Character>();
	
	public AlphabeticGame() {
		start = ConstDatas.RANDOM.nextInt(ConstDatas.INITIAL_NUMBER_RANGE);
		end = ConstDatas.RANDOM.nextInt(ConstDatas.SKIP_COUNT)+2;
	}
	
	public char getCorrectAnswer() {
		return correctAnswer;
	}


	@Override
	public String generateQuestions() {
		question = (char) (start + 'a') + ConstDatas.SPACING;
		for(int i = 0; i < 4; i++) {
			start += end;
			char alphabet = (char) (start + 'a');
			while(alphabet > 'z') {
				alphabet -= 26;
			}
			if(i<3) question += alphabet + ConstDatas.SPACING;
			else correctAnswer = alphabet;
		}
		return question;
	}
	
	@Override
	public void showQuestions() {
		System.out.println(generateQuestions() + "(-------)");
		showAnswer();
		requestUserInput();
		System.out.println(nextProblem());
	}
	
//	@Override
	public void generateAnswer() {
		int num = 0;
		int cor_position = ConstDatas.RANDOM.nextInt(4);
		do {
			if(multipleBox.size() == cor_position) {
				multipleBox.put((char) (num+'a'), correctAnswer);
			} else {
				char choice = (char) (ConstDatas.RANDOM.nextInt(25) + 'a');
				multipleBox.put((char)(num + 'a'), choice);
			}
			num++;
		} while (multipleBox.size()!=4);
	}
	
	public Map<Character, Character> showAnswer() {
		generateAnswer();
		Set<Entry<Character, Character>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Character>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Character, Character> entry = it.next();
			System.out.print(entry.getKey() + ")" + entry.getValue()+ConstDatas.SPACING);
		}
		System.out.println("");
		return multipleBox;
	}
	
//	@Override
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
		Set<Entry<Character, Character>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Character>> it = set.iterator();
		boolean invalidInput = true;
		while(it.hasNext()) {
			Entry<Character, Character> entry = it.next();
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
