package Inheritance;
import RectangleAggregationArea.Length;

public abstract class Circle extends Shape{
	
	private Length radius;
	public static final double PI = 3.14;
	
	public Circle(String color, Length radius) {
		super(color);
		this.radius = radius;
	}
	
//	ဒီနေရာမှာ area က Shape ထဲက area() ကို override ပြန်လုပ်တာမို့ Shape ထဲမှာကတော့ void ဖြစ်နေပြီး ဒီမှာက double ဖြစ်နေတယ်
//	အဲ့တော့ abstract class နဲ့ child class နဲ့ ချိတ်လိုက်ပြီဆိုရင် abstract class ထဲက abstract method ကိုပြန်ရေးပေးရတယ်
//	အဲ့လိုမရေးရင်တော့ child class ကိုလည်း abstract class လိုက်ပြောင်းပေးရတယ် အဲ့လိုပြောင်းလိုက်ရင်တော့ ShapeTest ထဲမှာ
//	constructor ကိုသုံးပြီး object ဆောက်လို့မရတော့ဘူး ဒါကြောင့် အခု circle class အတွက် သီးခြား Child_Circle class
//	တစ်ခုကို circle ကနေ extends လုပ်ပြီး ထပ်ရေးပေးရတယ်
	
/*
	အတိုချုပ်ပြောရရင် Parent class က abstract class ဖြစ်နေရင် child class မှာ parent မှာရှိတဲ့
	abstract method တွေအတွက် implementation ရေးရင်ရေး မရေးရင် child class ကို abstract ထပ်လုပ်ပြီး
	child class ကနေ inheritance ထပ်ခံပြီးမှ အဲ့ဒီ့ child class ရဲ့ child class constructor ကိုသုံးပြီးတော့မှ
	object ဆောက်လို့ရမယ်
*/
	public double area1() {
		return PI * radius.convertInches() * radius.convertInches();
	}

	@Override
	public String toString() {
		return super.toString() + " ";
	}
	
}
