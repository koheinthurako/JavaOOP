package DurationTest;

public class TimeLine {
	
	private int hr;
	private int min;
	private int sec;
	private static final int SEC_CONST = 3600;
	
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
	
	public void toSec() {
		int startSec = hr * SEC_CONST;
		int endSec = hr * SEC_CONST;
	}

	@Override
	public String toString() {
		return "[ hour=" + hr + ", min=" + min + ", sec=" + sec + " ]";
	}
	
}
