package IQGame;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IQGameController {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		GameControl aGame = new AlphabeticGame();
		GameControl ageGame = new AgeGame();
		GameControl fiboGame = new FibonacciGame();
		GameControl skipNumGame = new SkipNumberGame();
		GameControl calcGame = new CalculationGame();
		
		Player.playerName = "";
		while(Player.playerName.isEmpty()) {
			System.out.print("Please enter your name : ");
			try{
				Player.playerName = sc.nextLine();
				if(Player.playerName.isEmpty()) System.err.println("Type something...");
				else {
					System.out.println("Answer the following questions\n____________________________\n");
					List<GameControl> gameCollections = Arrays.asList(aGame, ageGame, fiboGame, skipNumGame, calcGame);
					gameCollections.forEach(game -> game.showQuestions());
					Answer.loadingAnimation();
					Player.checkAnswer();
				}
				
			} catch (NoSuchElementException e) {
				System.out.println("Invalid values...");
			}
		}

		sc.close();
		
	}

}
