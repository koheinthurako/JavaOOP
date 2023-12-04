package Interface;

interface A {
	String NAME = "Thet";
}

public interface Shape {
//	Abstract ထဲတွင်  implementation လုပ်တဲ့ method ကော မလုပ်တဲ့ method ကော ပါပေမယ့်
//	Interface ထဲတွင်ပါတဲ့ method တွေကတော့ abstract method တွေပဲဖြစ်ကြတယ်
//	public static final ဆိုသည့် အရာသည် interface ထဲတွင် auto ပါပြီးသားဖြစ်တယ်
	String COLOR = "RED";

//	method များရဲ့ရှေ့မှာလည်း public abstract ဆိုပြီးပါထားပြီးသားဖြစ်တယ်
	void area();
	
//	interface ထဲတွင် method တွေအားလုံးသည် definition ပဲပါတဲ့ abstract method တွေဖြစ်ကြတယ်
//	သို့သော် implementation ပါသည့် method ကိုရေးချင်တယ်ဆိုရင် static / default ကိုထည့်ပေးရတယ်
	public static void methodOne() {
		System.out.println("This is method one from interface!");
	}

//	Default method တွေသည် interface class ထဲမှာပဲရေးလို့ရတယ်
//	methodTwo() သည် Circle.java ထဲတွင် default ဆိုပြီးတန်းရေးလို့မရလို့ interface class ထဲမှာအရင်ရေးပြီးမှ Circle.java ထဲမှာ override ပြန်လုပ်
	public default void methodTwo() {
		System.out.println("This is method two from interface");
	}

}
