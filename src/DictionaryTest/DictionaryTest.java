package DictionaryTest;

import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to My Dictionary! Let's find the number...");
		System.out.println("Please choose type from the following...");
		System.out.println("1. Number " + " " + "2. English " + " " + "3. Romanji");
		int input = sc.nextInt();
		Digit.chooseType(input);
		
		sc.close();
	}

}
