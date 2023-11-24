package Inheritance;
import RectangleAggregationArea.Length;

public class Circle extends Shape{
	
	private Length radius;
	public static final double PI = 3.14;
	
	public Circle(String color, Length radius) {
		super(color);
		this.radius = radius;
	}

}
