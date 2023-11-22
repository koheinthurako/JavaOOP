package DurationChecker;

public class TimeLine {

	private int hr;
	private int min;
	private int sec;
	private static final int HR_CONST = 3600;
	private static final int MIN_CONST = 60;

	public TimeLine() {

	}

	public TimeLine(int hour, int min, int sec) {
		super();
		this.hr = hour;
		this.min = min;
		this.sec = sec;
	}

	public int getHour() {
		return hr;
	}

	public void setHour(int hour) {
		this.hr = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public int toSec() {
		int totalSec = (hr * HR_CONST) + (min * MIN_CONST) + sec;
		return totalSec;
	}

	public TimeLine toOriginalFormat(int total) {

		int toHr = 0;
		int toMin = 0;
		int toSec = 0;

		while (total >= HR_CONST) {
			toHr++;
			total -= HR_CONST;
		}

		while (total >= MIN_CONST) {
			toMin++;
			total -= MIN_CONST;
		}

		toSec = total;

		return new TimeLine(toHr, toMin, toSec);
	}

	@Override
	public String toString() {
		return hr + "hr " + min + "min " + sec + "sec";
	}

}
