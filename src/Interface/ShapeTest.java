package Interface;
import RectangleAggregationArea.Length;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Length l1 = new Length(1, 2);
//		Length l2 = new Length(2, 3);

//		Interface တွင်လည်း constructor ကနေ object ဆောက်လို့မရပါ
		Shape s = new Circle(l1);
		s.area();
		
	}

}
