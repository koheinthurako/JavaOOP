package ObjectTestAssignments;

import java.time.LocalDate;
import java.time.Period;
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
	
	public static void main(String[] args) {

		programStart();
		
		sc.close();
		
	}
	
	public static int checkInput(String msg, int minValue, int maxValue) {
		while(true) {
			System.out.print(msg);
			try {
				int year = Integer.parseInt(sc.nextLine());
				if(year < minValue | year > maxValue) {
					System.err.println("Please try again...");
				} else {
					System.out.println("---------------------------------------");
					return year;
				}
			} catch (NumberFormatException e) {
				System.err.println("Please enter numbers only...");
			}
		}
	}
	
	public static int calculateTotalMonths() {
		LocalDate now = LocalDate.now();
		LocalDate birth = LocalDate.of(birthYear, birthMonth, birthDay);
		int totalMonths = 0;
		for(int year = birth.getYear(); year < now.getYear(); year++) {
			totalMonths += birth.lengthOfMonth();
		}
		totalMonths += birth.lengthOfMonth() - birth.getMonthValue();
		return totalMonths-birth.getMonthValue()-(now.lengthOfMonth() - now.getMonthValue());
	}
	
	public static void requestDay() {
		int daysInMonth = LocalDate.of(birthYear, birthMonth, START_VALUE).lengthOfMonth();
		birthDay = checkInput("Please enter your birth day : ", START_VALUE, daysInMonth);
	}
	
	public static void requestMonth() {
		birthMonth = checkInput("Please enter your birth month : ", START_VALUE, MONTH_VALUE);
	}
	
	public static void requestYear() {
		birthYear = checkInput("Please enter your birth year between " + 
					START_YEAR + " and " + END_YEAR + " : ", START_YEAR, END_YEAR);
	}
	
	public static void programStart() {
		System.out.println("Let's calculate how many months have you lived!");
		requestYear();
		requestMonth();
		requestDay();
		System.out.println(calculateTotalMonths());
	}

}
