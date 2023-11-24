package Inheritance;
import RectangleAggregationArea.Length;

public class Square extends Shape{
	
	Length width;
	
	public Square(String color, Length width) {
		super(color);
		this.width = width;
	}
	
	public void area() {
		System.out.println(width.convertInches()*width.convertInches());
	}

}
