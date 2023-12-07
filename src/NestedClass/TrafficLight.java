package NestedClass;

//	Enum အကြောင်းစမယ် Enum သည် Java မှ support ပေးသည့် feature တစ်ခုဖြစ်တယ်
//	Normal Class တစ်ခုကို object တွေလိုသလိုအများကြီးဆောက်လို့ရတယ်
//	ဒါပေမယ့် class တစ်ခုကို ဆောက်နိုင်တဲ့ object တွေကန့်သတ်ထားချင်ရင် Enum ကိုသုံးတယ်
//	ဥပမာ - traffic light မှာ ဝါ၊ စိမ်း၊ နီ သုံးရောင်ပဲရှိတယ် အဲ့တာတွေမဟုတ်တဲ့ object တွေကိုလက်မခံချင်လို့ enum ကိုသုံးတယ်
//	enum improves type safety
//	enum မှာ condition စစ်ရင် switch နဲ့ပဲအစစ်များတယ်
//	enum က interface တို့ abstract တို့လိုမဟုတ်ပဲ class အနေနဲ့ရှိလို့ object တိုက်ရိုက်လှမ်းဆောက်ခေါ်လိုက်ရင်ရပြီ
//	enum can have fields, constructor and methods
//	enum သည် interface တွေအများကြီးကို implements လုပ်နိုင်တယ် သို့သော် တခြားရိုးရိုး class တွေကို inheritance သဘောနဲ့ extends သွားလုပ်လို့မရဘူး ဘာလို့လဲဆိုတော့
//	သူ့က java က support ပေးတဲ့ enum class ကိုသွားပြီး auto extends လုပ်ပြီးသားဖြစ်လို့ ရိုးရိုး class တွေကိုမရပဲ interface တွေကိုပဲ implements လုပ်လို့ရမယ်


public enum TrafficLight {
//	enum သည် static final ပုံစံဖြစ်လို့ အကြီးစာလုံးတွေနဲ့ပဲရေးပေးရတယ်
//	အောက်က variable တွေကို constant လို့ခေါ်တယ်
	RED, GREEN, ORANGE
	
//	Enum ရဲ့ example project  NestedNumberDictionary Package ကိုဆက်ကြည့်ပါ
	
}
