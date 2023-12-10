package AboutObjects;

public class StringObjectTest {

	public static void main(String[] args) {

//		String �?ွေသည် caseSensitive ဖြစ်�?ယ်
		
		String st = "Ko Heinaefa";
		String st2 = "Thet";
		StringObjectTest stObj = new StringObjectTest();
		
		System.out.println(st.getClass());
		System.out.println(stObj.getClass().getSimpleName());
		
		System.out.println("CharAt : " + st.charAt(1));
		System.out.println("EndsWith : " + st.endsWith("n"));
		
//		indexOf က Hein ကိုရှာလိုက်�?ော့ index 0 ဖြစ်�?ဲ့ K ကနေ H ကိုရောက်�?ဲ့အထိစရှာ�?ယ်
//		အ�?ွဲလိုက်ရှာရင် အ�?ွဲလိုက်�?န်ဖိုးအရင်မှန်မှရမယ် အ�?ွဲလိုက်မမှန်ရင် -1 ပြန်�?ယ် မှန်သွားရင်�?ော့
//		အစ H ရဲ့ index နေရာကိုပဲ return ပြန်ပေး�?ယ်
		System.out.println("IndexOf(subString) : " + st.indexOf("Hein"));
//		ဒီနေရာမှာ သ�?ိထားရမှာက formIndex ပါလာရင် အရှေ့ကရှာ�?ျင်�?ဲ့ string ရဲ့ length နဲ့မ�?ူရဘူး မကြီးရဘူး
		System.out.println("IndexOf(subString and fromIndex) : " + st.indexOf("o", 1));
		
//		lastIndexOf က Hein ကိုရှာလိုက်�?ော့ index 0 ဖြစ်�?ဲ့ K ကနေ H ကိုရောက်�?ဲ့အထိစရှာ�?ယ်
//		အ�?ွဲလိုက်ရှာရင် အ�?ွဲလိုက်�?န်ဖိုးအရင်မှန်မှရမယ် အ�?ွဲလိုက်မမှန်ရင် -1 ပြန်�?ယ် မှန်သွားရင်�?ော့
//		အစ H ရဲ့ index နေရာကိုပဲ return ပြန်ပေး�?ယ်
		System.out.println("LastIndexOf(subString) : " + st.lastIndexOf("Hein"));
//		အောက်ကဟာက�?ော့ fromIndex ဆို�?ဲ့ 5 နေရာထိအရင် substring လိုဖြ�?်လိုက်�?ယ် 5 နောက်ကဟာ�?ွေကို ဖြ�?်�?ျလိုက်�?ယ်
//		ပြီး�?ော့ အရှေ့ 5 လုံးထဲက လို�?ျင်�?ာကိုအ�?ွဲလိုက်ပြန်ရှာပြီး ပထမဆုံး H ရဲ့ index ကိုပဲ return ပြန်ပေး�?ယ်
		System.out.println("LastIndexOf(subString and fromIndex) : " + st.lastIndexOf("Hein", 3));
		
//		Substring beginIndex
		System.out.println("Substring beginIndex : " + st.substring(4));
//		Substring beginIndex and endIndex => 3 လုံးမြောက်ပြည့်�?ဲ့နေရာထိအရင်ဖြ�?်ပြီး �?� လုံးမြောက်နေရာရဲ့နောက်ပိုင်းကိုအကုန်ဖြ�?်�?ျ
		System.out.println("Substring beginIndex and endIndex : " + st.substring(3, 5));	
		
//		Replace
		System.out.println("Replace : " + st2.replace("The", "Zaw"));
		
//		startsWith
		System.out.println("startsWith : " + st2.startsWith("T"));
		
//		toCharArray
//		ဒါက Thet ကို character array �?စ်�?ုအနေနဲ့ character �?စ်လုံး�?ျင်းစီကို array ထဲထည့်လိုက်�?ယ်
		char [] charArray = st2.toCharArray();
//		print ထု�?်ရင် ဒီ�?ိုင်း charArray ဆိုပြီးထု�?်လိုက်ရုံနဲ့ Array �?န်ဖိုး�?ွေအကုန်ထွက်လာ�?ယ် index နဲ့ထု�?်လည်းရ�?ယ်
		System.out.println(charArray);
		System.out.println("ToCharArray : " + charArray[0]);
		
		
//		Trim
//		trim သည် whitespace, leading space �?ွေကိုဖျက်ပေး�?ယ် string ရဲ့အရှေ့ဆုံးက space �?ွေကို leading space လို့�?ေါ်ပြီး
//		string နောက်ဆုံးက space �?ွေကို trailing space �?ွေလို့�?ေါ်�?ယ် trim က string အလယ်က space �?ွေကို�?ော့ မဖျက်ပါ
		String st3 = "   Thet  Zaw  Hein   ";
		System.out.println("Original : " + st3 + ", " + "Trimmed : " + st3.trim());
		
//		CONCAT သည် string ကိုယာယီဆက်ပေး�?ြင်းဖြစ်သည် variable ကြေညာရင် variable ထဲဆက်ထား�?ဲ့�?န်ဖိုးအသစ်သာရောက်သွားပြီး မူရင်း String �?န်ဖိုးမပြောင်းပါ
		System.out.println("Concat : " + st3.concat("Welcome"));
		
//		CompareTo
//		compareTo သည် String နှစ်�?ု�??�?န်ဖိုး�?ွေကို နှိုင်းယှယ်�?ြင်းဖြစ်ပြီး return ကို integer ပြန်ပေး�?ာသ�?ိထားရမယ်
//		သူက �?ိုက်စစ်လိုက်�?ဲ့ စာလုံး�?ွေကြားဘယ်နှလုံးကွာ�?ြား�?ျက်ရှိနေလဲဆို�?ာအရေအ�?ွက်နဲ့ပြပေး�?ြင်းဖြစ်�?ယ်
//		�?ိုက်စစ်လိုက်�?ဲ့ဘက်က နည်းနေရင် "-" နဲ့ပြပြီး များနေရင် ရိုးရိုးပဲပြ�?ယ် �?န်ဖိုး�?ွေ�?ူ�?ယ်ဆို 0 return ပြန်�?ယ်
		String st4 = "The";
		System.out.println("CompareTo : " + st4.compareTo(st2));
		
//		Contains က�?ော့ String ထဲမှာ ရှာလိုက်�?ဲ့�?န်ဖိုးပါမပါစစ်ပြီး ပါရင် true မပါရင် false return ပြန်�?ယ် 
		System.out.println("Contains : " + st4.contains("e"));
		
		
//		String Builder အကြောင်းစမယ်
//		String Builder �?ွေဟာ immuta
		
		
	}

}
