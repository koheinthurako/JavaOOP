package GameAssignment;
import java.util.Scanner;

public class Gamble {
	
	Game game;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gamble gamble = new Gamble();
		
		System.out.println("Welcome to The Gambling World!");
		System.out.println("Please choose games...");
		System.out.println("1. Dice    2. Coil");
		
		if (sc.hasNextInt()) {
            gamble.ChooseGame(sc.nextInt());
        } else {
            System.out.println("Invalid Values!. Please enter numbers only.");
        }
		
		sc.close();
		
	}
	
	public void ChooseGame(int gameNumber) {
		if(gameNumber==1) {
			// Using up casting polymorphism
			game = new Dice(0, 0);
			AcceptChoice(gameNumber);
		} else if(gameNumber==2) {
			game = new Coin(0, 0);
			AcceptChoice(gameNumber);
		} else {
			System.out.println("Sorry! We don't have that game ...");
		}
	}
	
	public void AcceptChoice(int selectedGame) {
		game.playGame(selectedGame);
	}
	
}
