package IQGame;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class AlphabeticGame {

	int start;
	int end;
	String question;
	char correctAnswer;
	Random r = new Random();
	Map<Character, Character> multipleBox = new LinkedHashMap<Character, Character>();
	Character[] answerBox;
	
	public AlphabeticGame() {
		start = r.nextInt(10);
		end = r.nextInt(10)+2;
	}
	
	public char getCorrectAnswer() {
		return correctAnswer;
	}


	public String generateQuestions() {
		System.out.println("Start number : " + start);
		System.out.println("Skip number : " + end);
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
	
	public void showQuestions() {
		System.out.println(generateQuestions() + "(-------)");
		showAnswer();
		requestUserInput();
	}
	
	public void generateAnswer() {
		int num = 0;
		System.out.println("Correct Answer : " + correctAnswer);
		int cor_position = r.nextInt(4);
		do {
			if(multipleBox.size() == cor_position) {
				multipleBox.put((char) (num+'a'), correctAnswer);
			} else {
				char choice = (char) (r.nextInt(25) + 'a');
				multipleBox.put((char)(num + 'a'), choice);
			}
			num++;
		} while (multipleBox.size()!=4);
		System.out.println("multipleAnswerBox : " + multipleBox);
	}
	
	public Map<Character, Character> showAnswer() {
		generateAnswer();
		Set<Entry<Character, Character>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Character>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Character, Character> entry = it.next();
			System.out.print(entry.getKey() + ")" + entry.getValue()+ConstDatas.SPACING);
		}
		return multipleBox;
	}
	
	public void requestUserInput() {
		System.out.print("\nGuess answer : ");
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				String input = sc.nextLine();
				checkInput(input);
				break;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.print("Guess answer : ");
			}
		}
		sc.close();
	}
	
	public void checkInput(String input) {
		Scanner sc = new Scanner(System.in);
		Set<Entry<Character, Character>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Character>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Character, Character> entry = it.next();
			if(input.charAt(0)==entry.getKey()) {
				if(correctAnswer==entry.getValue()) Player.winCount++;
			}
		}
		System.out.println("Winner count : " + Player.winCount);
		sc.close();
	}

}
