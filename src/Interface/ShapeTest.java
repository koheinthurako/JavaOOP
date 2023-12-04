package Interface;
import RectangleAggregationArea.Length;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Length l1 = new Length(1, 2);
//		Length l2 = new Length(2, 3);

//		Interface တွင်လည်း constructor ကနေ object ဆောက်လို့မရပါ
		Shape s = new Circle(l1);
		Shape q = new Square(l1);
//		s.area();
//		q.area();
		
		Shape[] shapes = {s, q};
		for(Shape shape : shapes) {
			shape.area();
		}
		
//		Shape.java ထဲတွင် methodOne() သည် static ရေးထား၍ Shape.methodOne() ဆိုပြီးလှမ်းခေါ်ပေးရတယ်
		Shape.methodOne();
//		obj ကနေ တစ်ဆင့် ခေါ်ချင်ရင်တော့ Shape.java ထဲတွင် default ရေးပြီးခေါ်ပေးရမယ်
		s.methodTwo();
		
	}

}
