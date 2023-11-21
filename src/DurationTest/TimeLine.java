package DurationTest;

public class TimeLine {
	
	private int hour;
	private int min;
	private int sec;
	
	public TimeLine(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
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

	@Override
	public String toString() {
		return "TimeLine [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}
	
}
