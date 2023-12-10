package API;

public class StringObjectTest {

	public static void main(String[] args) {

//		String Object သည် Case Sensitive & Immutable ဖြစ်တယ်
		
		String st = "Ko Heinaefa";
		String st2 = "Thet";
		StringObjectTest stObj = new StringObjectTest();
		
		System.out.println(st.getClass());
		System.out.println(stObj.getClass().getSimpleName());
		
//		ChatAt
		System.out.println("CharAt : " + st.charAt(1));
		
//		EndsWith
		System.out.println("EndsWith : " + st.endsWith("n"));
		
//		indexOf က Hein ကိုရှာလိုက်တော့ index 0 ဖြစ်တဲ့ K ကနေ H ကိုရောက်တဲ့အထိစရှာမယ်
//		အတွဲလိုက်ရှာရင် အတွဲလိုက်တန်ဖိုးအရင်မှန်မှရမယ် အတွဲလိုက်မမှန်ရင် -1 ပြန်မယ် မှန်သွားရင်တော့
//		အစ H ရဲ့ index နေရာကိုပဲ return ပြန်ပေးမယ်
		System.out.println("IndexOf(subString) : " + st.indexOf("Hein"));
//		ဒီနေရာမှာ သတိထားရမှာက formIndex ပါလာရင် အရှေ့ကရှာချင်တဲ့ string ရဲ့ length နဲ့မတူရဘူး မကြီးရဘူး
		System.out.println("IndexOf(subString and fromIndex) : " + st.indexOf("o", 1));
		
//		lastIndexOf က Hein ကိုရှာလိုက်တော့ index 0 ဖြစ်ခဲ့တဲ့ K ကနေ H ကိုရောက်အထိစရှာမယ်
//		အတွဲလိုက်ရှာရင် အတွဲလိုက်တန်ဖိုးအရင်မှန်မှရမယ် အတွဲလိုက်မမှန်ရင် -1 ပြန်မယ် မှန်သွားရင်တော့
//		အစ H ရဲ့ index နေရာကိုပဲ return ပြန်ပေး�?ယ်
		System.out.println("LastIndexOf(subString) : " + st.lastIndexOf("Hein"));
//		အောက်ကဟာမှာ fromIndex ဆိုတဲ့ 5 နေရာထိအရင် substring လိုဖြတ်လိုက်မယ် index 5 နောက်ကဟာတွေကိုအရင်ဖျက်ချလိုက်မယ်
//		ပြီးတော့ အရှေ့ 5 လုံးထဲက လိုချင်တဲ့အတွဲလိုက်ကိုပြန်ရှာပြီး ပထမဆုံး H ရဲ့ index ကိုပဲ return ပြန်ပေးမယ်
		System.out.println("LastIndexOf(subString and fromIndex) : " + st.lastIndexOf("Hein", 5));
		
//		Substring beginIndex
		System.out.println("Substring beginIndex : " + st.substring(4));
//		Substring beginIndex and endIndex => 3 လုံးမြောက်ပြည့်တဲ့နေရာထိအရင်ဖြတ်ပြီး 5 လုံးမြောက်နေရာရဲ့နောက်ပိုင်းကိုအကုန်ဖြတ်ချ
		System.out.println("Substring beginIndex and endIndex : " + st.substring(3, 5));	
		
//		Replace
		System.out.println("Replace : " + st2.replace("The", "Zaw"));
		
//		startsWith
		System.out.println("startsWith : " + st2.startsWith("T"));
		
//		toCharArray
//		ဒါက Thet ကို character array တစ်ခုအနေနဲ့ character တစ်လုံးချင်းစီကို array ထဲထည့်လိုက်မယ်
		char [] charArray = st2.toCharArray();
//		print ထုတ်ချင် ဒီအတိုင်း charArray ဆိုပြီးထုတ်လိုက်ရုံနဲ့ Array တန်ဖိုးတွေအကုန်ထွက်လာမယ် index နဲ့ထုတ်လည်းရတယ်
		System.out.println(charArray);
		System.out.println("ToCharArray : " + charArray[0]);
		
		
//		Trim
//		trim သည် whitespace, leading space တွေကိုဖျက်ပေးမယ် string ရဲ့အရှေ့ဆုံးက space တွေကို leading space လို့ခေါ်ပြီး
//		string နောက်ဆုံးက space တွေကို trailing space တွေလို့ခေါ်တယ် trim က string အလယ်က space တွေကိုတော့ မဖျက်ပေးပါ
		String st3 = "   Thet  Zaw  Hein   ";
		System.out.println("Original : " + st3 + ", " + "Trimmed : " + st3.trim());
		
//		CONCAT သည် string ကိုယာယီဆက်ပေးခြင်းဖြစ်သည် variable ကြေညာရင် variable ထဲဆက်ထားတဲ့ တန်ဖိုးအသစ်ရောက်သွားပြီး မူရင်း st3 တန်ဖိုးမပြောင်းပါ
		System.out.println("Concat : " + st3.concat("Welcome"));
		
//		CompareTo
//		compareTo သည် String နှစ်ခုတန်ဖိုးတွေကို နှိုင်းယှဉ်ခြင်းဖြစ်ပြီး return ကို integer ပြန်ပေးတာသတိထားရမယ်
//		သူကတိုက်စစ်လိုက်တဲ့ စာလုံးတွေကြားဘယ်နှလုံးကွာခြားချက်ရှိနေလဲဆိုတာကို အရေအတွက်နဲ့ပြပေးခြင်းဖြစ်တယ်
//		တိုက်စစ်လိုက်တဲ့ဘက်က နည်းနေရင် "-" နဲ့ပြပြီး များနေရင် ရိုးရိုးပဲပဲပြမယ် တန်ဖိုးတူတယ်ဆို 0 return ပြန်မယ်
		String st4 = "The";
		System.out.println("CompareTo : " + st4.compareTo(st2));
		
//		Contains ကတော့ String ထဲမှာ ရှာလိုက်တဲ့တန်ဖိုးပါမပါစစ်ပြီး ပါရင် true မပါရင် false return ပြန်မယ် 
		System.out.println("Contains : " + st4.contains("e"));
		
	}

}
