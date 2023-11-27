package Interface;

public class Circle implements Shape {
//	class အချင်းချင်းဆိုရင် extends နဲ့ အမွေဆက်ခံပြီး interface နဲ့ class ဆိုရင် child class မှာ implements နဲ့အမွေဆက်ခံရတယ်
//	interface အချင်းချင်းဖြစ်သွားပြီဆိုရင်တော့ extends နဲ့ ပဲ အမွေဆက်ခံရပြန်တယ်

	@Override
	public void area() {
		System.out.println("This is area");
	}
	
	@Override
	public void methodTwo() {
		System.out.println("This is methodTwo from circle");
	}
	

}
