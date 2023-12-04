package NestedClass;

//	nestedClass ဆိုတာ ရိုးရိုး class တွေအတိုင်းပဲအကုန်လုပ်လို့ရတယ် nested class တွေကို object ဆောက်ချင်တယ်ဆိုရင် outerClass ကိုအရင် object ဆောက်
//	ရိုးရိုး class ထဲမှာဆောက်တဲ့ class ကို member level class လို့ခေါ်ပြီး
//	method ထဲမှာဆောက်တဲ့ class ကို local member level class လို့ခေါ်တယ်
//	innerClass ကို ဘယ်လိုတွေသုံးလဲဆိုရင် ဥပမာ - class တစ်ခုထဲမှာ name, NRC ဆိုပြီးရှိတယ် NRC ထဲမှာ မှ string, Integer တွေ
//	method တွေအများကြီးတိုက်စစ်စရာရှိလာတဲ့အခါ NRC ကို DataTypes တစ်ခုထဲအနေနဲ့ယူလို့မရတော့ပဲ class တစ်ခုအနေနဲ့ယူလိုက်မှအဆင်ပြေမှာမို့
//	member level class အနေနဲ့ဆောက် သုံးသွားတယ်
//	innerClass တွေထဲမှာမှ Anonymous Inner Class က အသုံးများတယ် သူတို့ကို interface တွေနဲ့တွဲသုံးတာများတယ်

class Outer {
	int i = 1;

//	member class
	class Inner {
		int i = 2;

		public void methodInner() {
			System.out.println("This is inner class method");
		}
	}

	public void methodOuter() {
//		ဒီအထဲက localInner class သည် outerClass နဲ့မဆိုင်တော့ပဲ methodOuter() method အထဲမှာပဲရှိတာမို့ method ကနေခေါ်မှပဲရမယ်
//		local level member class 
		class LocalInner {
			int i = 5;

			public void methodLocalInner() {
				System.out.println(i);
				System.out.println("This is local inner method from localInner class in methodOuter method");
			}
		}
		System.out.println("This is outer class method");
		LocalInner localInner = new LocalInner();
		localInner.methodLocalInner();
	}

}

class TestAnonymous implements Anonymous {

	@Override
	public void testing() {
		System.out.println("This is anounymous test");
	}

	@Override
	public void testing2() {
		System.out.println("This is anonymous testing2 method");
	}

}

public class NestedClass {

	public static void main(String[] args) {

		Outer outer = new Outer();
		System.out.println(outer.i);
		outer.methodOuter();

		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.i);
		inner.methodInner();

//		ဒါသည် ရိုးရိုး interface class ကိုအပေါ်က TestAnonymous မှ implements လှမ်းလုပ်ပြီး object ဆောက်ပြီးမှ အထဲက method ကိုခေါ်ခြင်း
		TestAnonymous test = new TestAnonymous();
		test.testing();

//		နောက်တစ်နည်းသည် အပေါ်ကလို interface ထဲက method ကိုအလုပ်လုပ်ဖို့ class ကြီးသီးသန့်တစ်ခုဆောက်မနေတော့ပဲ
//		constructor ကနေကပ်တိုးလေး အလုပ်လုပ်ခိုင်းခြင်း အဲ့တာကို anonymous inner class လို့ခေါ်တယ် သူ့ကိုဆောက်ပြီးရင်တောင်
//		interface Anonymous ထဲက method တွေက abstract method တွေဖြစ်လို့ method overriding ပြန်လုပ်ပေးရမယ်
		Anonymous objAnonymous = new Anonymous() {
			@Override
			public void testing() {
				System.out.println("This is test method using anonymous inner class");
			}

			@Override
			public void testing2() {
				System.out.println("This is testing2 method using anonymous inner class");
			}
		};
		
//		Interface class မှ method တွေကို ရိုးရိုး class တစ်ခုဆောက်ပြီးမှ object ထပ်ဆောက်ပြီးခေါ်သုံးခြင်းနှင့်
//		object တစ်ခုဆောက်ပြီးမှ anonymous class အနေနဲ့ခေါ်သုံးခြင်းတို့၏ ကွာခြားချက်-----
//		ရိုးရိုး class တစ်ခုဆောက်ပြီးမှ object တစ်ခုဆောက်ပြီးအလုပ်လုပ်ခိုင်းခြင်းသည် class တစ်ခုလုံး၏ ပုံမှန်အတိုင်းလုပ်ဆောင်နိုင်သည်များကို ကျယ်ကျယ်ပြန့်ပြန့် အသုံးပြုနိုင်ပြီး
//		object ဆောက်ပြီးမှ anonymous class အနေနဲ့သုံးခြင်းသည် implementation တွေ method တွေသည် object တစ်လုံးထဲမှာပဲမှီခိုသွားပြီး
//		normal class တစ်ခုလို ကျယ်ကျယ်ပြန့်ပြန့် အသုံးမပြုနိုင်တော့ပါ
		
//		Anonymous ကို GUI တွေနဲ့ချိတ်ဆက်ရေးတဲ့အပိုင်းမှာ အသုံးများတယ် ဥပမာ - button တွေအများကြီးထဲကို ကိုယ်စီအလုပ်လုပ်တဲ့ method/function တွေကိုရေးချင်တဲ့အခါ 

		objAnonymous.testing2();

	}

}
