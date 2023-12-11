package API;

public class MathObjectTest {

	public static void main(String[] args) {

//		Java.lang.Math အကြောင်းစမယ်
		
//		Math.ceil() ကို ဒီတိုင်း Math ဆိုပြီးယူသုံးလို့ရတယ် Math.ceil() က 1 ကျော်တာနဲ့  1 တိုးပေးတယ်
//		ဒီနေရာမှာ သတိထားရမှာက Math တို့ Scanner class တို့က final class ဖြစ်လို့ extends ဆိုပြီး အမွေဆက်ခံလို့မရပါ
		System.out.println("ceil() : " + Math.ceil(1.1));
		
//		Math.floor() က 1.9 ဆိုရင်တောင် 1 လျှော့ယူတယ်
		System.out.println("floor(): " + Math.floor(1.9));
		
//		Math.pow() သည် ရှေ့စာလုံးက တန်ဖိုးကို နောက်ကတန်ဖိုး power တင်ပေး
		System.out.println("pow() : " + Math.pow(2, 3));
		
		System.out.println("PI * x : " + (Math.PI * 2));
		
	}

}
