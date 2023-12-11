package API;

public class WrapperClassTest {

	public static void main(String[] args) {

//		Wrapper class အကြောင်းစမယ်
		
//		Output ကိုသတိထားကြည့်ပါ ဒီနေရာမှာ string တစ်ခုကြားထဲမှာ မလာမချင်း arithmetic အတိုင်းတွက်သွားပြီး
//		string ရဲ့နောက်ပိုင်းမှစလို့ "+" သည် ConCatination ပုံစံအတိုင်း ဆက်သွားသည် 
		System.out.println(2 + 5 + " = " + 2 + 5);
		
//		output ကို 2 + 5 = 7 ထွက်ချင်ရင် အောက်ကလို ကွင်းခတ်လိုက်လို့ရပေမယ့် ဒါသည် integer တွေအတွက်ပဲအသေဖြစ်သွားလိမ့်မယ်
		System.out.println(2 + " + " + 5 + " = " + (2 + 5) + "\n");
		
//		project တွေရေးတဲ့ dynamic data တွေကို တွက်ချက်ရတော့မယ်ဆိုရင် Wrapper Class တွေကိုသုံးကြရတယ်
//		Wrapper class ဆိုတာက primitive data type 8 ခုကို class အနေနဲ့ ကိုယ်စားပြုပြီး Java မှာ ရေးထားခြင်းဖြစ်တယ်
//		အဲ့လိုရေးလိုက်ရင် data type တွေက class အဖြစ်ပြောင်းသွားလို့ object တွေဆောက်နိုင်ပြီး သူတို့အထဲက method တွေကိုယူသုံးနိုင်တယ်

		System.out.println("--- Start wrapper class ---");
		
		Integer a = 2;
		Integer b = 5;
//		အပေါ်ကလို a + b = 7 ဆိုပြီးရအောင် wrapper class တွေကိုသုံးပြီးရေးမယ်
//		အဓိကကတော့ wrapper class တွေသုံးတာက method() တွေနဲ့အလွယ်တကူတွက်ချင်လို့
//		ဒါဆိုရင် int a လို့မကြေညာပဲ Integer အနေနဲ့ ကြေညာလိုက်တော့ a & b က object တွေဖြစ်သွားလို့ method() တွေကိုယူသုံးနိုင်တယ်
//		ဒီနေရာမှာ a တွေသည် object တွေဖြစ်တယ် အဲ့တာကြောင့် အရင် a+b= လို့ရေးပြီး ‌string() ပြောင်းလိုက်တယ် ပြီးရင် result 7 ရချင်တာမို့
//		string() ရဲ့နောက်မှာ string ထပ်ဆက်ရမှာမို့ concat() ကိုသုံးလိုက်တယ် သို့သော် အထဲကတန်ဖိုးတွေက integer အနေနဲ့တွက်ရမှာမို့
//		a.intValue() ဆိုပြီး integer ပြောင်းလိုက်တယ် သို့သော် concat က string ကိုပဲလက်ခံတာမို့ အထဲက intValue() ပြောင်းပြီးပေါင်းထားတာကို
//		ကွင်းခတ်ပြီးနောက်မှာ concat ကလက်ခံနိုင်အောင် string ""  အလွတ်တစ်ခုနဲ့ထပ်ပေါင်းပေးလိုက်တယ်
//		byteValue() longValue() doubleValue() ဆိုပြီးကြိုက်ရာချိန်းနိုင်တယ်
		System.out.println((a + " + " + b + " = ").toString().concat((a.intValue() + b.intValue()) + ""));
		
//		ဒါသည် method အတွေအလွယ်ယူသုံးပြီး အထောက်အကူဖြစ်သည်
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE + "\n");
		
//		Boxing & UnBoxing
//		primitive data type ကနေ Wrapper class ကိုချိန်းရင် boxing
		Integer it1 = 10;
		
//		wrapper class ကနေ primitive data type ကိုချိန်းရင် UnBoxing
		it1 = it1.intValue();
		
//		Type Casting မှာ data type တစ်ခုကို အခြားတစ်ခုကိုပြောင်းရင်နှစ်မျိုးရှိတယ်
//		parseXxx နဲ့လည်းရသလို xxx.valueOf() နဲ့လည်းရတယ် သို့သော် သူတို့ရဲ့ return ပြန်တန်ဖိုးကကွာတယ်
		System.out.println("--- Test Type Casting ---");
		String name = "12";
		System.out.println(Integer.valueOf(name).toString().charAt(0) + "5");
//		valueOf() က instance/object ကို return ပြန်တယ် အဲ့ဒါကြောင့် သူ့နောက်မှာ "." ခံပြီး method တွေထပ်ခေါ်လို့ရတယ်
		int unboxName = Integer.valueOf(name); // UnBoxing
		System.out.println(unboxName);
//		ဒါကြောင့် integer တန်ဖိုးထပ်လိုချင်ရင် သူ့ကို UnBoxing ပြန်လုပ်ပေးရတယ်
		
		String name2 = "1";
		System.out.println(Integer.parseInt(name2));
//		parseInt() က integer တန်ဖိုးကို return ပြန်တယ်
//		Integer. ဆိုပြီး class ကနေလှမ်းခေါ်ထားပေမယ့် return က integer ဖြစ်သွားလို့ method တွေထပ်ခေါ်မရတော့ပါ
		
	}

}
