package Inheritance;

public abstract class Shape {

	private String color;
	
	/*
	Abstract = Definition ပဲပါပြီး implementation တွေမရှိတဲ့ method များ
	ဥပမာ - Department တစ်ခုမှာ Delivery, Finance, Cleaning... စသည့် အလုပ်များလုပ်ရမယ်ဆိုပြီးတော့
	နည်းလမ်းတွေချပေးထားရုံပဲချပေးထားရပြီး တကယ့်တကယ်အလုပ်လုပ်ရင် သက်ဆိုင်တဲ့သူတွေကပဲ သူ့အလုပ်သူ လုပ်သွားကြတာမျိုးကို
	"Abstract" နည်းလမ်းလို့ခေါ်တယ် class တစ်ခုထဲမှာ abstract method တွေပါလာရင်
	class ရှေ့မှာလည်း abstract keyword ကိုထည့်ပေးရတယ်
	ဒီမှာလည်း Shape က Area တွက်ပေးရမယ်လို့ abstract ကိုသုံးပြီး ကြေညာလိုက်တယ် တကယ့်တကယ်အလုပ်လုပ်ရင်တော့
	child class တွေဖြစ်တဲ့ circle & Square ထဲမှာပဲ area() method တွေက ကိုယ်စီအလုပ်လုပ်သွားကြတယ်
*/
	public abstract void area();

	public Shape(String color) {
		super(); 
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color : " + color;
	}

}
