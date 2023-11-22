package DurationChecker;

public class Duration {

	private TimeLine startTime;
	private TimeLine endTime;

	public Duration(TimeLine startTime, TimeLine endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public TimeLine getStartTime() {
		return startTime;
	}

	public void setStartTime(TimeLine startTime) {
		this.startTime = startTime;
	}

	public TimeLine getEndTime() {
		return endTime;
	}

	public void setEndTime(TimeLine endTime) {
		this.endTime = endTime;
	}

	public void calcDuration() {
		int totalDuration = endTime.toSec() - startTime.toSec();
		TimeLine toFinalTimeline = new TimeLine();
		System.out.println("Total Duration : " + toFinalTimeline.toOriginalFormat(totalDuration));
	}

	@Override
	public String toString() {
		return "Start time : " + startTime + "\n" + "End Time : " + endTime;
	}

}
