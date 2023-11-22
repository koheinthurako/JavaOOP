package DurationChecker;

public class DurationCalculation {

	public static void main(String[] args) {

		Duration duration = new Duration(new TimeLine(9, 35, 00), new TimeLine(11, 30, 05));
		System.out.println(duration);
		duration.calcDuration();

	}

}
