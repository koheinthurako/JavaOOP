package RectangleAggregationArea;

public class RectangleCalc {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(new Length(1, 5), new Length(2, 5), "Red");
		System.out.println(rec);
		rec.calcArea();
		
	}

}
