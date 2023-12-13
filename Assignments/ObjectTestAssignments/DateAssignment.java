package ObjectTestAssignments;

import java.time.LocalDate;
import java.time.Period;

public class DateAssignment {

	public static void main(String[] args) {

		System.out.println("Welcome to my program! \nLet's calculate how many days you alived...");
		LocalDate myBirthday = LocalDate.of(1999, 10, 15);
		LocalDate presentDay = LocalDate.now();
		Period alivedDays = Period.between(myBirthday, presentDay);
		System.out.println(myBirthday.lengthOfYear()-myBirthday.getDayOfYear());
//		System.out.println(alivedDays.getYears() + 1);
		System.out.println(alivedDays.getYears());
		
	}

}
