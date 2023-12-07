package NestedNumberDictionary;

import java.util.Scanner;

public class DigitDictionary {
	
	public static void main(String[] args) {

//		Digits သည် enum ဖြစ်လို့ constructor ကနေ object ဆောက်စရာမလိုပဲ ENUM className"." ခံပြီး တိုက်ရိုက်တန်ဖိုးလှမ်းထည့်လို့ရသည်
//		အဲ့ဒါဆိုရင်ဖြစ်သွားတဲ့ပုံစံက ဟိုဘက်က constructor Digits(int digit) ဆိုတဲ့နေရာမှာ ONE(1) ဆိုပြီးဖြစ်သွားပြီး အဲ့တန်ဖိုးက d1 ထဲကိုဝင်သွားတယ်
		Digits d1 = Digits.ONE;
		System.out.println(d1.name() + " - " + d1.getDigit() + " japanese : " + d1.getJpDigit() + "\n");

//		Start MiniProgram
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the numbers : ");

//		int num = sc.nextInt();
		int num = Integer.parseInt(sc.nextLine());

//		Digits class က enum ဖြစ်လို့သူ့ထဲက အများပိုင် method တစ်ခုကိုလှမ်းခေါ်ချင်ရင် Object ဆောက်ရမယ်
//		သို့သော် object ဆောက်မယ်ဆို ENUM class ထဲကရှိပြီးသား OBJ တစ်လုံးကိုတိုက်ရိုက်ယူထည့်ရမှာမို့ OBJ တွေအများကြီးနဲ့ဆိုင်တဲ့ method ကို
//		OBJ တစ်ခုအသေပေးပြီးမှ အဲ့ OBJ ကနေလှမ်းခေါ်တာက မဖြစ်သင့်ဘူး ဒါကြောင့် OBJ ကနေ မခေါ်တော့ပဲ
//		getEnumConst(num) method ကို Digits class မှ လှမ်းခေါ်တယ်
		Digits constDigit = Digits.getEnumConst(num);
		if(constDigit != null)
		System.out.println(constDigit.name() + " (" + constDigit.getJpDigit() + ")");

		System.out.print("Please enter japanese : ");
//		ဒီနေရာမှာ NullPointerException Error တက်နိုင်တယ် ဘာလို့ဆို အပေါ်က scanner က nextInt() က တန်ဖိုးရိုက်ပြီး enter ခေါက်လိုက်တဲ့အခါ
//		2 enter ဆို အပေါ် sc က 2 ကိုတန်းယူသွားပြီး enter ခေါက်လိုက်တဲ့အခါ ခေါက်လိုက်တဲ့ enter က အောက်က japan ထဲတစ်ခါတည်းဝင်သွားတယ် Digits ထဲက condition စစ်တော့ 
//		null ဖြစ်သွားတယ် အဲ့လိုမဖြစ်အောင် အလွယ်ကူဆုံးဖြေရှင်းနည်းက အပေါ်မှာ sc.nextInt() ကို Interger.parseInt(sc.nextLine()) ဆိုပြီး Interger ပြောင်းပေးရမယ်
//		သဘောက nextLine ဆိုတော့ "2 enter" ဆို 2 ကော enter ကောယူသွားပြီးမှ parseInt ပြောင်းပြီး 2 ကိုပဲ Scanner ထဲထည့်လိုက်တဲ့သဘော
//		ပြီးမှ အောက်က japan scanner ကအသစ်ထပ်တောင်းသလိုဖြစ်သွားမယ်
		String japan = sc.nextLine();
		Digits constDigit2 = Digits.getEnumConst(japan);
		System.out.println(constDigit2.name() + " (" + constDigit2.getJpDigit() + ")");

		System.out.print("enter enum constant : ");
		String constant = sc.nextLine().toUpperCase();
//		valueOf = string to ENUM constant ပြောင်းခြင်း
		try {
			Digits obj = Digits.valueOf(constant);
			System.out.println(obj.getDigit() + " (" + obj.getJpDigit() + ")");
		} catch (IllegalArgumentException e) {
			System.err.println("Wrong Input!");
		}

//		Digits digits[] = Digits.values();
//
//		for (Digits d : digits) {
//			System.out.println(d.name() + " - " + d.getDigit() + " japanese : " + d.getJpDigit());
//		}

		sc.close();

	}

}
