package NestedNumberDictionary;

public class DigitDictionary {

	public static void main(String[] args) {
		
//		Digits သည် enum ဖြစ်လို့ constructor ကနေ object ဆောက်စရာမလိုပဲ className"." ခံပြီး တိုက်ရိုက်တန်ဖိုးလှမ်းထည့်လို့ရသည်
//		အဲ့ဒါဆိုရင်ဖြစ်သွားတဲ့ပုံစံက ဟိုဘက်က constructor Digits(int digit) ဆိုတဲ့နေရာမှာ ONE(1) ဆိုပြီးဖြစ်သွားပြီး အဲ့တန်ဖိုးက d1 ထဲကိုဝင်သွားတယ်
		Digits d1 = Digits.ONE;
		System.out.println(d1.name() + " - " + d1.getDigit());
		
		Digits digits[] = Digits.values();

		for (Digits d : digits) {
			System.out.println(d.name());
		}

	}

}
