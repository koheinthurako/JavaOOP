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

	public static void showAnswer() {
		generateAnswer();
		Set<Entry<Character, Integer>> set = multipleBox.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			System.out.print(entry.getKey() + ")" + entry.getValue() + ConstDatas.SPACING);
		}
		System.out.println("");
	}
	
	public static void loadingAnimation() throws InterruptedException {
		System.out.println("____________________________________________\n");
		String[] stars = {"* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "*"};
            for (String star : stars) {
            	Thread.sleep(200);
            	System.out.print(star);
            }
            System.out.println("");
	}
	
}
