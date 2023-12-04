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
	
//	interface ထဲတွင် implementation ပါသည့် method ကိုရေးချင်တယ်ဆိုရင် static / default ကိုထည့်ပေးရတယ်
	public static void methodOne() {
		System.out.println("This is method one from interface!");
	}

	public default void methodTwo() {
		System.out.println("This is method two from interface");
	}

}
