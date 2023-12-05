package DictionaryTest;

import java.util.Scanner;

public enum Digit {

	ZERO(0, "レイ"), ONE(1, "一"), TWO(2, "ニ"), THREE(3, "三"), FOUR(4, "四"), FIVE(5, "五");

	public static Scanner sc = new Scanner(System.in);

	private int digit;
	private String japanese;

	Digit(int digit, String japanese) {
		this.digit = digit;
		this.japanese = japanese;
	}

	public int getDigit() {
		return digit;
	}

	public String getJapanese() {
		return japanese;
	}

	public static Digit checkNumber(int input) {
		switch (input) {
		case 0:
			return ZERO;
		case 1:
			return ONE;
		case 2:
			return TWO;
		case 3:
			return THREE;
		case 4:
			return FOUR;
		case 5:
			return FIVE;
		default:
			return null;
		}
	}

	public static Digit checkString(String input) {
		switch (input) {
		case "rei":
			return ZERO;
		case "ichi":
			return ONE;
		case "ni":
			return TWO;
		case "san":
			return THREE;
		case "shi":
			return FOUR;
		case "go":
			return FIVE;
		default:
			return null;
		}
	}

	public static void fromNumber() {
		System.out.print("Please enter numbers from 0 to 5 (in digit) : ");
		if (sc.hasNextInt()) {
			int input = sc.nextInt();
			Digit result = checkNumber(input);
			if (result != null)
				System.out.println(result.name() + " (" + result.getJapanese() + ")");
			else
				System.err.println("Sorry you can check between 0 to 5");
		} else {
			System.err.println("Invalid Input! Plesae enter only numbers");
		}

	}

	public static void fromEnglish() {
		System.out.print("Please enter letters from zero to five (in english) : ");
		String input = sc.nextLine().toUpperCase();
		try {
			Digit result = Digit.valueOf(input);
			System.out.println("Digit : " + result.getDigit());
			System.out.println("Japanese : " + result.getJapanese());
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid Input!");
		}

	}

	public static void fromRomanji() {
		System.out.print("Please enter numbers from rei to go (in romanji) : ");
		String input = sc.nextLine();
		Digit result = checkString(input);
		if (result != null) {
			System.out.println("Digit : " + result.name());
			System.out.println("Japanese : " + result.getJapanese());
		} else {
			System.err.println("Invalid Input!");
		}
	}

	public static Digit chooseType(int selectedNum) {
		switch (selectedNum) {
		case 1:
			fromNumber();
			return null;
		case 2:
			fromEnglish();
			return null;
		case 3:
			fromRomanji();
			return null;
		default:
			System.err.println("Wrong Choice!");
			return null;
		}
	}

}
