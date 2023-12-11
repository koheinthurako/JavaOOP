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

//		System.out.println("--- Start wrapper class ---");
		
		Integer a = 2;
		Integer b = 5;
//		အပေါ်ကလို a + b = 7 ဆိုပြီးရအောင် wrapper class တွေကိုသုံးပြီးရေးမယ်
//		အဓိကကတော့ wrapper class တွေသုံးတာက method() တွေနဲ့အလွယ်တကူတွက်ချင်လို့
//		ဒါဆိုရင် int a လို့မကြေညာပဲ Integer အနေနဲ့ ကြေညာလိုက်တော့ a & b က object တွေဖြစ်သွားလို့ method() တွေကိုယူသုံးနိုင်တယ်
//		ဒီနေရာမှာ a တွေသည် object တွေဖြစ်တယ် အဲ့တာကြောင့် အရင် a+b= လို့ရေးပြီး ‌string() ပြောင်းလိုက်တယ် ပြီးရင် result 7 ရချင်တာမို့
//		string() ရဲ့နောက်မှာ string ထပ်ဆက်ရမှာမို့ concat() ကိုသုံးလိုက်တယ် သို့သော် အထဲကတန်ဖိုးတွေက integer အနေနဲ့တွက်ရမှာမို့
//		a.intValue() ဆိုပြီး integer ပြောင်းလိုက်တယ် သို့သော် concat က string ကိုပဲလက်ခံတာမို့ အထဲက intValue() ပြောင်းပြီးပေါင်းထားတာကို
//		ကွင်းခတ်ပြီးနောက်မှာ concat ကလက်ခံနိုင်အောင် string ""  အလွတ်တစ်ခုနဲ့ထပ်ပေါင်းပေးလိုက်တယ်
		System.out.println((a + " + " + b + " = ").toString().concat((a.intValue() + b.intValue()) + ""));
		
		
		
	}

}
