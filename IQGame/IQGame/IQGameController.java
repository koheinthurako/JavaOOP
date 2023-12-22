package IQGame;

public class IQGameController {
	
	public static void main(String[] args) {

		AlphabeticGame aGame = new AlphabeticGame();
		AgeGame ageGame = new AgeGame();
		
		aGame.showQuestions();
		ageGame.showQuestions();
		System.out.println("Win times : " + Player.winCount);
		
	}

}
