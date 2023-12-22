package IQGame;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Player {
	
	public static int winCount = 0;
	public static String prize;
	
	public static void requestUserInput() {
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
	
	public static void checkInput(String input) {
		Set<Entry<Character, Integer>> set = Answer.multipleBox.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		boolean invalidInput = true;
		while(it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			if(input.charAt(0)==entry.getKey()) {
				if(Answer.CORRECT_ANSWER==entry.getValue()) winCount++;
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

}
