package TestAssignments;

public class RectangleArea {
	
	String width;
	String height;
	String color;
	
	public static void main(String[] args) {
		
		RectangleArea R1 = new RectangleArea("1.5", "2.5", "Red");
		R1.toFeet(R1.calcArea());
		
		RectangleArea R2 = new RectangleArea("2.5", "3.5", "Green");
		R2.toFeet(R2.calcArea());
		
		RectangleArea R3 = new RectangleArea("3", "5", "Blue");
		R3.toFeet(R3.calcArea());
		
	}
	
	public RectangleArea(String width, String height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double calcArea() {
		double width = Double.parseDouble(this.width);
		String widthValue = String.valueOf(width);
		String [] wfeetAndInch = widthValue.split("\\.");
		double wFeet = (Double.parseDouble(wfeetAndInch[0])) * 12;
		double wInch = Double.parseDouble(wfeetAndInch[1]);
		
//		 change feet into inch and plus all inches for width
		double finalWidth = wFeet + wInch; 
		
		double height = Double.parseDouble(this.height);
		String heightValue = String.valueOf(height);
		String [] hFeetAndInch = heightValue.split("\\.");
		double hFeet = (Double.parseDouble(hFeetAndInch[0])) * 12;
		double hInch = Double.parseDouble(hFeetAndInch[1]);
		
//		change feet into inch and plus all inches for height
		double finalHeight = hFeet + hInch;
		
//		Calculate area into inches
		double area = finalWidth * finalHeight;
		
		return area;
	}
	
	public void toFeet(double area) {
		// for feet
		double dFeet = area/144;
		
		// for inch
		double dInch = area%144;
		
		// Change double to integer to round up value for printing
		int feet = (int)Math.round(dFeet);
		int inch = (int)Math.round(dInch);
		
		String result = String.valueOf(feet) + " ft²" + " " + String.valueOf(inch) + " in²";
		System.out.println(result + " (" + color + ")");
	}
	
}