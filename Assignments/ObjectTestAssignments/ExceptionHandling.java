package ObjectTestAssignments;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int START_YEAR = 1990;
	public static final int END_YEAR = 2010;
	public static final int MONTH_VALUE = 12;
	public static int birthYear = 0;
	public static int birthMonth = 0;
	
	public static void main(String[] args) {

//		requestUserInput();
		
		
		
		sc.close();
		
	}
	
	public static void requestDay() {
		while(true) {
			System.out.print("Please enter your birth month : ");
			try {
				int day = Integer.parseInt(sc.nextLine());
				if(day < 0 | day > MONTH_VALUE) {
					System.err.println("There is only " + MONTH_VALUE + " months in a year.");
				} else {
					birthMonth = day;
					break;
				}
			} catch (NumberFormatException e) {
				System.err.println("Invalid Input! Please try again...");
			}
			System.out.println("---------------------------------------");
		}
	}
	
	public static void requestMonth() {
		while(true) {
			System.out.print("Please enter your birth month : ");
			try {
				int month = Integer.parseInt(sc.nextLine());
				if(month < 0 | month > MONTH_VALUE) {
					System.err.println("There is only " + MONTH_VALUE + " months in a year.");
				} else {
					birthMonth = month;
					break;
				}
			} catch (NumberFormatException e) {
				System.err.println("Invalid Input! Please try again...");
			}
			System.out.println("---------------------------------------");
		}
	}
	
	public static void requestYear() {
		while(true) {
			System.out.print("Please enter your birth year : ");
			try {
				int year = Integer.parseInt(sc.nextLine());
				if(year < START_YEAR | year > END_YEAR) {
					System.err.println("You have to enter your birth year between " + START_YEAR + " and " + END_YEAR);
				} else {
					birthYear = year;
					break;
				}
			} catch (NumberFormatException e) {
				System.err.println("Invalid Input! Please try again...");
			}
			System.out.println("---------------------------------------");
		}
	}
	
	public static void requestUserInput() {
		System.out.println("Let's calculate how many months have you lived!");
		requestYear();
		requestMonth();
		requestDay();
	}

}
