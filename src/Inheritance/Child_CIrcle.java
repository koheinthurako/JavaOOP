package Inheritance;
import RectangleAggregationArea.Length;

public class Child_CIrcle extends Circle{
	
	Length radius;
	public static final double PI = 3.14;
	
	 public Child_CIrcle(String color, Length radius) {
		 super(color, radius);
		 this.radius = radius;
	 }
	 
	 public void area() {
			System.out.println("Area from child_circle = " + PI * radius.convertInches() * radius.convertInches());
			System.out.println("Area1 method = " + super.area1());
	}

}
