package NestedNumberDictionary;

public enum Digits {

//	constant တစ်ခုချင်းစီကိုထပ်ပြီး values လေးတွေသတ်မှတ်ခြင်း
//	ဒီနေရာမှာ သတိထားပါ ZERO(0) ဆိုတာသည် ZERO သည် enum ထဲတွင် object ဖြစ်သည် ဒါကြောင့် နောက်က (0) ပါလာခြင်းသည် constructor သဘောမျိုးဖြစ်သွား၍
//	ထည့်လိုက်တဲ့ တန်ဖိုးတွေကို လက်ခံဖို့ အောက်မှာ constructor တစ်ခုထပ်ဆောက်ပေးဖို့လိုအပ်သည်
	ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

	private int digit;

//	ပုံမှန် class တွေမှာ constructor ရှေ့မှာ ဘာမှမရေးရင် default ဖြစ်ပြီး enum မှာတော့ "private" အနေနဲ့ရှိနေတယ်
//	ဘာလို့လဲဆိုတော့ enum ရဲ့သဘောတရားသည် object တွေဆောက်ခြင်းကို ကန့်သတ်ချင်တာဖြစ်လို့ constructor ရဲ့ရှေ့မှာ တခြား Access Modifier တွေပါနေလို့မရဘူး
//	constructor တွေရဲ့သဘာဝကိုက object ဆောက်ရင်သုံးတာကြောင့် object ကိုအလွယ်ပေးမဆောက်တဲ့ enum မှာ constructor ရှေ့ private ပါနေရခြင်းဖြစ်တယ်
	Digits(int digit) {
		this.digit = digit;
	}

	public int getDigit() {
		return digit;
	}

}
