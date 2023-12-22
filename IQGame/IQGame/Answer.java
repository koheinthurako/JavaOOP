package IQGame;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Answer {

	public static int CORRECT_ANSWER;
	static Map<Character, Integer> multipleBox = new LinkedHashMap<Character, Integer>();

	public static void generateAnswer() {
		int num = 0;
		int cor_position = ConstDatas.RANDOM.nextInt(4);
		do {
			if (multipleBox.size() == cor_position) {
				multipleBox.put((char) (num + 'a'), CORRECT_ANSWER);
			} else {
				int choice = ConstDatas.RANDOM.nextInt(CORRECT_ANSWER) + ConstDatas.ANS_RANGE;
				if (choice > (CORRECT_ANSWER - ConstDatas.ANS_RANGE) | choice < CORRECT_ANSWER + ConstDatas.ANS_RANGE) {
					multipleBox.put((char) (num + 'a'), choice);
				}
			}
			num++;
		} while (multipleBox.size() != 4);
	}

	public static Map<Character, Integer> showAnswer() {
		generateAnswer();
		Set<Entry<Character, Integer>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			System.out.print(entry.getKey() + ")" + entry.getValue() + ConstDatas.SPACING);
		}
		System.out.println("");
		return multipleBox;
	}

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
//		Set<Entry<Character, Integer>> set = multipleBox.entrySet();
//		Iterator<Entry<Character, Integer>> it = set.iterator();
//		boolean invalidInput = true;
//		while(it.hasNext()) {
//			Entry<Character, Integer> entry = it.next();
//			if(input.charAt(0)==entry.getKey()) {
//				if(CORRECT_ANSWER==entry.getValue()) Player.winCount++;
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
//		
//	}

}
