package ObjectTestAssignments;

import java.time.DayOfWeek;
import java.time.LocalDate;

//	How many Monday exists in 2023.

public class MondayCount {
	
	public static final int YEAR = 2023;
	public static final int MONTH = 1;
	public static final int DAY = 1;

	public static void main(String[] args) {

		int countMonday = 0;
        LocalDate startDate = LocalDate.of(YEAR, MONTH, DAY);
        
        while(startDate.getYear() == YEAR) {
        	if(startDate.getDayOfWeek() == DayOfWeek.MONDAY) {
        		countMonday++;
        	}
        	startDate = startDate.plusDays(DAY);
        }

        System.out.println("Total numbers of Monday in " + YEAR + " : " + countMonday);
		
	}

}
