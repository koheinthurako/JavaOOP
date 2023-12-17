package OOPProject;

import java.util.HashMap;
import java.util.Map;

public class Answer {
	
	Map<Character, Integer> choices = new HashMap<>();
	
	public Map<Character, Integer> generate_Multiple_Choice(int correct_ans) {
		int no = 0;
		int cor_position = Constant.random.nextInt(4);
		do {
			if(choices.size()==cor_position) {
				choices.put((char) (no+Constant.CONVERT_CHAR), correct_ans);
			} else {
				int choice = Constant.random.nextInt(correct_ans) + Constant.ANS_RANGE;
				if(choice>(correct_ans-Constant.ANS_RANGE) | choice<correct_ans+Constant.ANS_RANGE) {
					choices.put((char) (no+Constant.CONVERT_CHAR), choice);
				}
			}
			no++;
		} while (choices.size()!=4);
		return choices;
	}

	public Map<Character, Integer> getChoices() {
		return choices;
	}

}
