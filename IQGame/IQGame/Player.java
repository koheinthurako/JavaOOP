package IQGame;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Player {

	public static String playerName;
	public static int winCount = 0;
	public static Prizes prize;

	public static void requestUserInput() {
		System.out.print("Enter your answer : ");
		while (true) {
			try {
				String input = ConstDatas.sc.nextLine();
				checkInput(input);
				break;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.print("Enter your answer : ");
			}
		}
	}

	public static void checkInput(String input) {
		Set<Entry<Character, Integer>> set = Answer.multipleBox.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		boolean invalidInput = true;
		while (it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			if (input.charAt(0) == entry.getKey()) {
				if (Answer.CORRECT_ANSWER == entry.getValue())
					winCount++;
				invalidInput = false;
				return;
			} else {
				invalidInput = true;
			}
		}

		if (invalidInput) {
			requestUserInput();
		}
	}
	
	public static void checkAnswer() {
		System.out.println("Player Name : " + playerName);
		switch (winCount) {
			case 0:
				prize = Prizes.valueOf("NO_IQ");
				System.out.println("Try harder next time!");
				System.out.println("You are " + prize);
				break;
			case 1: case 2: 
				prize = Prizes.valueOf("SILVER");
				System.out.println("You get : '" + prize + "'");
				System.out.println("Thanks. Good Job!");
				break;
			case 3: case 4:
				prize = Prizes.valueOf("GOLD");
				System.out.println("You are amazing!.");
				System.out.println("You get : '" + prize + "'");
				break;
			case 5:
				prize = Prizes.valueOf("DIAMOND");
				System.out.println("Congratulations! You are so brilliant!.");
				System.out.println("You get : '" + prize + "'");
				break;
			default:
				System.out.println("Invalid value!");
		}
	}

}
