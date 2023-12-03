package Interface;
import RectangleAggregationArea.Length;
	
public class Circle implements Shape, A {
//	class အချင်းချင်းဆိုရင် extends နဲ့ အမွေဆက်ခံပြီး interface နဲ့ class ဆိုရင် child class မှာ implements နဲ့အမွေဆက်ခံရတယ်
//	interface အချင်းချင်းဖြစ်သွားပြီဆိုရင်တော့ extends နဲ့ ပဲ အမွေဆက်ခံရပြန်တယ်
//	ပုံမှန် class တွေဆိုရင် multiple inheritance မရပေမယ့် interface မှာတော့ "," ခံပြီး multiple inheritance လုပ်လို့ရတယ်

	Length radius;
	private static final double PI = 3.14;
	
	public Circle(Length radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println(radius);
		System.out.println((radius.convertInches() * radius.convertInches()) * PI);
	}

	@Override
	public void methodTwo() {
		System.out.println("This is methodTwo from circle");
	}

}
