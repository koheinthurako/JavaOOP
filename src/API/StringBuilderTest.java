package API;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
//		String Builder အကြောင်းစမယ်
//		String Builder တွေဟာ mutable ဖြစ်တယ် immutable ဆိုတာ String Builder တွေထဲက method တစ်ခုခုကို ရှိပြီးသား string
//		ပေါ်မှာ ခေါ်သုံးလိုက်ပြီဆိုတာနဲ့ ရှိပြီးသား string တန်ဖိုးက ပြောင်းသွားတယ်
		
		System.out.println("----- Start about string builder methods -----");
		
		StringBuilder stBuilder = new StringBuilder("Thet Zaw Hein");
		
//		Capacity မူရင်း default တန်ဖိုးကို 16 သတ်မှတ်ထားတယ် ကိုယ့်ဘာသာပြန်သတ်မှတ်ပေးလို့လည်းရတယ်
//		အပေါ်မှာ "Thet Zaw Hein" က length 13 လုံးရှိလို့ မူရင်း capacity 16 နဲ့ပေါင်းရင် 29 လုံး return ပြန်ပေးတယ်
		System.out.println("Capacity() : " + stBuilder.capacity() + "\n");
		
//		Length()
		System.out.println("length() : " + stBuilder.length() + "\n");
		
//		append()
		System.out.println("append() : " + stBuilder.append(" (AKA) Ko Hein"));
//		ဒီနေရာမှာ StringBuilder တွေက mutable ဖြစ်လို့ မူရင်း stBuilder တန်ဖိုးကအောက်မှာ print ထုတ်တော့ပြောင်းသွားပြီ
		System.out.println("Original value after append() : " + stBuilder + "\n");
		
//		insert()
//		insert က (int offset, String st) ဆိုပြီး အရှေ့မှာ offset ဆိုတဲ့ တန်ဖိုးလေးတစ်ခုထည့်ပေးရတယ်
//		အဲ့ဒီတန်ဖိုးက String ထဲက index position ဖြစ်ပြီးတော့ အဲ့ဒီနေရာကို နောက်ကပါလာတဲ့ st တန်ဖိုးကိုထပ်ထည့်ပေးလိုက်တယ်
		System.out.println("insert() : " + stBuilder.insert(2, "a"));
		System.out.println("insert() : " + stBuilder.insert(12, "t"));
		System.out.println("Original value after insert() : " + stBuilder + "\n");
		
//		replace()
		System.out.println("replace() : " + stBuilder.replace(0, 15, "Captain"));
		System.out.println("Original value after replace() : " + stBuilder + "\n");
		
//		reverse()
		System.out.println("reverse() : " + stBuilder.reverse());
		System.out.println("Original value after reverse() : " + stBuilder + "\n");
		
//		substring() သတိထားပါ substring() သည် stringBuilder Object မှာ method ခေါ်သုံးလို့ရပေမယ့် တစ်ကယ်တော့
//		String object ကပိုင်တာဖြစ်လို့ immutable ဖြစ်ပြီး မူရင်း stBuilder တန်ဖိုးမပြောင်းပါ
		System.out.println("substring() : " + stBuilder.substring(5));
		System.out.println("Original value after substring() : " + stBuilder + "\n");
		
//		indexOf() နဲ့စစ်ရင် 0 ကနေစရေတွက်တယ်
		System.out.println("indexOf() : " + stBuilder.indexOf("H"));
		
	}

}
