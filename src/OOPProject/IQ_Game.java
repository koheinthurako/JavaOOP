package OOPProject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IQ_Game {

	public static void main(String[] args) {

		Game_Control a_game = new Alphabatic_Game();
		Game_Control age_game = new Age_Game();
//		a_game.generateQuestion();
//		a_game.displayQuestion();
		
		List<Game_Control> games = Arrays.asList(a_game, age_game);
		
		games.stream().forEach((game -> game.displayQuestion()));
		age_game.generateQuestion();
		
		Answer ans = new Answer();
		Map<Character, Integer> map = ans.generate_Multiple_Choice(age_game.getCor_ans());
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			System.out.print(entry.getKey() + ")" + entry.getValue()+Constant.SPACING);
		}
		
//		ans.generate_Multiple_Choice(a_game.getCor_ans());
		
	}

}
