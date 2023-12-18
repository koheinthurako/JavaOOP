package ObjectTestAssignments;

import java.lang.NumberFormatException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int START_YEAR = 1990;
	public static final int END_YEAR = 2010;
	public static final int MONTH_VALUE = 12;
	public static final int START_VALUE = 1;
	public static int birthYear = 0;
	public static int birthMonth = 0;
	public static int birthDay = 0;
	
	public static void main(String[] args) throws InterruptedException {

		programStart();
		
		sc.close();
		
	}
	
	public static void loadingAnswer() throws InterruptedException {
		String[] stars = {"* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "*"};
            for (String star : stars) {
            	Thread.sleep(200);
            	System.out.print(star);
            }
	}
	
	public static int calculateTotalMonths() throws InterruptedException {
		LocalDate now = LocalDate.now();
		LocalDate birth = LocalDate.of(birthYear, birthMonth, birthDay);
		int totalMonths = 0;
		for(int year = birth.getYear(); year < now.getYear(); year++) {
			totalMonths += MONTH_VALUE;
		}
		loadingAnswer();
		return totalMonths + now.getMonthValue() - birth.getMonthValue();
	}
	
	public static int checkInput(String msg, int minValue, int maxValue, String errorValue) {
		while(true) {
			System.out.print(msg);
			try {
				int birthDate = Integer.parseInt(sc.nextLine());
				if(birthDate < minValue | birthDate > maxValue) {
					System.err.println("Invalid " + errorValue + "! Please try again...");
				} else {
					System.out.println("------------------------");
					return birthDate;
				}
			} catch (NumberFormatException e) {
				System.err.println("Please enter numbers only...");
			}
		}
	}
	
	public static int requestDay() {
		while(true) {
			System.out.print("Please enter your birth day : " );
			try {
				int inputDay = Integer.parseInt(sc.nextLine());
				LocalDate.of(birthYear, birthMonth, inputDay);
				birthDay = inputDay;
				return inputDay;
			} catch (NumberFormatException e) {
				System.err.println("Please enter numbers only...");
			} catch (DateTimeException e2) {
				System.err.println("ErrorDay : " + e2.getMessage());
			}
		}
	}
	
	public static void requestMonth() {
		birthMonth = checkInput("Please enter your birth month : ", START_VALUE, MONTH_VALUE, "month");
	}
	
	public static void requestYear() {
		birthYear = checkInput("Please enter your birth year between " + 
					START_YEAR + " and " + END_YEAR + " : ", START_YEAR, END_YEAR, "year");
	}
	
	public static void programStart() throws InterruptedException {
		System.out.println("Let's calculate how many months have you lived!");
		requestYear();
		requestMonth();
		requestDay();
		System.out.println("\nThere are " + calculateTotalMonths() + " months you have lived.");
		System.out.println("------------------------ \nEnjoy your day! \n--- Program Ended ---");
	}

}
