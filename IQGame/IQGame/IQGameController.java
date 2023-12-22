package IQGame;

import java.util.Arrays;
import java.util.List;

public class IQGameController {

	public static void main(String[] args) {

		GameControl aGame = new AlphabeticGame();
		GameControl ageGame = new AgeGame();
		GameControl fiboGame = new FibonacciGame();

		List<GameControl> gameCollections = Arrays.asList(aGame, ageGame, fiboGame);
		gameCollections.forEach(game -> game.showQuestions());

		System.out.println("Win times : " + Player.winCount);

	}

}
