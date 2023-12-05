package NestedNumberDictionary;

public enum Digits {
//	Enum တွေမှာ constant တွေကြေညာရင် class ရဲ့ ထိပ်ဆုံးမှာပဲရေးရမယ် သူ့အပေါ်မှာ ဘာမှထပ်ရေးလို့မရဘူး
	ZERO(0, "レイ"), ONE(1, "一"), TWO(2, "ニ"), THREE(3, "三"), FOUR(4, "四"), FIVE(5, "五");
//	constant တစ်ခုချင်းစီကိုထပ်ပြီး values လေးတွေသတ်မှတ်ခြင်း
//	ဒီနေရာမှာ သတိထားပါ ZERO(0) ဆိုတာသည် ZERO သည် enum ထဲတွင် object ဖြစ်သည် ဒါကြောင့် နောက်က (0) ပါလာခြင်းသည် constructor သဘောမျိုးဖြစ်သွား၍
//	ထည့်လိုက်တဲ့ တန်ဖိုးတွေကို လက်ခံဖို့ အောက်မှာ constructor တစ်ခုထပ်ဆောက်ပေးဖို့လိုအပ်သည်
	
	private int digit;
	private String jpDigit;

//	ပုံမှန် class တွေမှာ constructor ရှေ့မှာ ဘာမှမရေးရင် default ဖြစ်ပြီး enum မှာတော့ "private" အနေနဲ့ရှိနေတယ်
//	ဘာလို့လဲဆိုတော့ enum ရဲ့သဘောတရားသည် object တွေဆောက်ခြင်းကို ကန့်သတ်ချင်တာဖြစ်လို့ constructor ရဲ့ရှေ့မှာ တခြား Access Modifier တွေပါနေလို့မရဘူး
//	constructor တွေရဲ့သဘာဝကိုက object ဆောက်ရင်သုံးတာကြောင့် object ကိုအလွယ်ပေးမဆောက်တဲ့ enum မှာ constructor ရှေ့ private ပါနေရခြင်းဖြစ်တယ်

	private Digits(int digit) {
		this.digit = digit;
	}

	private Digits(int digit, String jpDigit) {
		this.digit = digit;
		this.jpDigit = jpDigit;
	}

	public int getDigit() {
		return digit;
	}

	public String getJpDigit() {
		return jpDigit;
	}
	
//	ENUM မှာ switch condition ကိုအသုံးများတယ်
	public static Digits getEnumConst(int num) {
		switch(num) {
//		return ပြန်လိုတာတွေသည် ENUM object တွေဖြစ်လို့ ဟိုဘက်မှာ object မှတစ်ဆင့် ENUM method တွေကိုသုံးလို့ရတယ်
		case 0: return ZERO;
		case 1: return ONE;
		case 2: return TWO;
		case 3: return THREE;
		case 4: return FOUR;
		case 5: return FIVE;
		default: return null;
		}
	}
	
	public static Digits getEnumConst(String num) {
		switch(num) {
		case "rei": return ZERO;
		case "ichi": return ONE;
		case "ni": return TWO;
		case "san": return THREE;
		case "shi": return FOUR;
		case "go": return FIVE;
		default: return null;
		}
	}

}
