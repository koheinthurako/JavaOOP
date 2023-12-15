package ObjectTestAssignments;

import java.time.LocalDate;
import java.util.Scanner;

public class TotalLivedDays {
	
	public static Scanner sc = new Scanner(System.in);
	public static int birth_year , birth_month, birth_day = 0;
	public static boolean checker = true;
	public static final int START_MONTH = 1;
	public static final int START_DAY = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to my program! \nLet's calculate how many days you have lived... \n");
		
		while(checker) {
			if(requestInput()) {
				LocalDate myBirthday = LocalDate.of(birth_year, birth_month, birth_day);
				LocalDate presentDay = LocalDate.now();
				int total_period_days = 0;
				for (int year = myBirthday.getYear(); year <= presentDay.getYear(); year++) {
					LocalDate startYear = LocalDate.of(year, START_MONTH, START_DAY);
					if (startYear.isLeapYear()) {
						total_period_days += startYear.lengthOfYear();
					} else {
						total_period_days += startYear.lengthOfYear();
					}
				}
				
				Thread loadingThread = new Thread(() -> loadingAnswer());
				loadingThread.start();
				try {
		            Thread.sleep(2000);
		        } catch (Exception e) {
		        }
				
				System.out.println("\nTotal numbers days you have lived : " +
						(total_period_days -
						 (myBirthday.getDayOfYear() +
							 (presentDay.lengthOfYear() - presentDay.getDayOfYear())) + " Days"));
				
				continueOrNot();
			} else {
				continueOrNot();
			}
		}
		
		sc.close();

	}
	
	public static boolean requestInput() {
		try {
			System.out.print("Please enter your birth year (YYYY) : ");
			int year = Integer.parseInt(sc.nextLine());
			if(year < START_DAY | year > LocalDate.now().getYear()) {
				System.err.println("Invalid Year Input!");
				return false;
			}
			birth_year = year;
			
			System.out.print("Please enter your birth month in number (MM) : ");
			int month = Integer.parseInt(sc.nextLine());
			if(month < 1 | month > 12) {
				System.err.println("Invalid Month Input!");
				return false;
			}
			birth_month = month;
			
			System.out.print("Please enter your birth day in number (DD) : ");
			int day = Integer.parseInt(sc.nextLine());
			int daysInMonth = LocalDate.of(year, month, START_DAY).lengthOfMonth();
			if(day < 1 | day > daysInMonth) {
				System.err.println("Invalid Day Input!");
				return false;
			}
			birth_day = day;
			
		} catch (NumberFormatException e) {
			System.err.println("Invalid Values! Please type numbers only!");
			return false;
		}
		return true;
	}
	
	public static void loadingAnswer() {
		String[] stars = {"* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "*"};
		try {
            for (String star : stars) {
                System.out.print(star);
                Thread.sleep(200);
            }
        } catch (Exception e) {
        }
	}
	
	public static void continueOrNot() {
		System.out.print("Do you want to start again ? Y/N : ");
		if(sc.nextLine().toLowerCase().equals("y")) {
			checker = true;
		} else {
			checker = false;
			System.out.println("Thanks for using my program!");
		}
	}
	
}
