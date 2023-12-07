package DictionaryTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DictionaryTest {

	public static Scanner sc = new Scanner(System.in);
	public static boolean checker = true;

	public static void main(String[] args) {

		System.out.println("Welcome to My Dictionary! Let's find the number...");
		programStart();

		sc.close();
	}

	public static void continueOrNot() {
		System.out.println("Do you want to start again? Y/N : ");
		sc.nextLine();
		String input = sc.nextLine();
		if (input.equals("y")) {
			programStart();
		} else {
			System.out.println("Thanks for using my dictionary \n --- Program Ended ---");
		}
	}

	public static void programStart() {
		System.out.println("Please choose type from the following...");
		System.out.println("1. Number " + " " + "2. English " + " " + "3. Romanji");
		try {
			int input = sc.nextInt();
			Digit.chooseType(input);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Values!");
			continueOrNot();
		}
		
	}

}
