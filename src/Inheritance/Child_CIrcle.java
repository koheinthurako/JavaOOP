package Inheritance;
import RectangleAggregationArea.Length;

public class Child_CIrcle extends Circle{
	
	Length radius;
	public static final double PI = 3.14;
	
	 public Child_CIrcle(String color, Length radius) {
		 super(color, radius);
	 }
	 
	 public void area() {
			System.out.println(PI * radius.convertInches() * radius.convertInches()); 
	}

}
