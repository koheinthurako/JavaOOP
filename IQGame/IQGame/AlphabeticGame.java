package IQGame;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class AlphabeticGame {

	int start;
	int end;
	Random r = new Random();
	Set<Character> dataBox = new LinkedHashSet<Character>();
	Character[] answerBox;
	
	public AlphabeticGame() {
		start = r.nextInt(10);
		end = r.nextInt(10)+2;
	}
	
	public void generateQuestions() {
		System.out.println("Random start number : " + start);
		System.out.println("Random end number : " + end);
		while(dataBox.size()<5) {
			char alphabet = (char) (start + 'a');
			while(alphabet > 'z') {
				alphabet -= 26;
			}
			dataBox.add(alphabet);
			start += end;
		}
		System.out.println(dataBox);
		showQuestions();
	}
	
	public void showQuestions() {
		String question = "";
//		Character[] charArray = dataBox.toArray(new Character[0]);
		answerBox = dataBox.toArray(new Character[0]);
		for(int i = 0; i < answerBox.length - 1; i++) {
			question += (answerBox[i] + "   ");
		}
		System.out.println(question + "(-------)");
//		System.out.println("DataBox : " + dataBox);
		requestUserInput();
	}
	
	public void requestUserInput() {
		System.out.print("Guess answer : ");
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				String input = sc.nextLine();
				checkInput(input);
				sc.close();
				break;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Guess answer : ");
			}
		}
		
	}
	
	public void checkInput(String input) {
		if(input.charAt(0) == answerBox[answerBox.length - 1]) System.out.println("True");
		else System.out.println("False");
	}

}
