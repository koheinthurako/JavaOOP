package RectangleAggregationArea;

public class Length {
	
	private int feet;
	private int inch;
	
	public Length(int feet, int inch) {
		this.feet = feet;
		this.inch = inch;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	@Override
	public String toString() {
		return feet + "'" + inch + "\"";
	}

}
