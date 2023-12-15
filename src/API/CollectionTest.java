package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

//		ပုံမှန်ဆို array က dataTypes တူတာတွေပဲ ထည့်လို့ရတယ်
//		Collection တွေက dataTypes မတူတာတွေကို array အနေနဲ့ ထည့်လို့ရတယ် သို့သော် Object တွေကိုပဲစုပေးထားနိုင်တယ် primitive တွေမရ
		
		int[] num= new int[5];
//		ဒီနေရာမှာ new int[5] ဆိုပြီး array အခန်းကိုကြိုကြေညာထားတယ် သဘောက array ကလည်း constructor ကနေခေါ်ထားတဲ့ object တစ်ခုပဲဖြစ်တယ် 
		num[0] = 1; num[1] = 2; num[2] = 3;
//		System.out.println(num.length);
//		array ကလည်း object ဖြစ်နေလို့ length တို့လို အထဲက method တွေယူသုံးလို့ရခြင်းဖြစ်တယ်
//		array ကိုသုံးမယ်ဆိုရင်တော့ အခန်းအရေအတွက်ကော ကြိုသတ်မှတ်ပေးရပြီး dataTypes တွေလည်းတူရတယ်
		
//		သို့သော် Collection ကတော့ အဲ့ဒါတွေမလိုပါ Dynamic ဖြစ်တယ်
//		Collection ထဲမှာ objects တွေကိုပဲစုလို့ရတယ် primitive dataTypes ‌တွေမရပါ
		

		
//		Collection ထဲမှာ List, Queue and Set ဆိုပြီးရှိတယ်
//		Java.util.List အကြောင်းစမယ်
		
//		List က interface class ဖြစ်တယ် => constructor နဲ့ object ဆောက်လို့မရ
		
//		1. ArrayList
		List list = new ArrayList<>();
		list.add("abc");
		list.add(1.2);
		list.add(1);
		System.out.println("Arraylist.add() : " + list);
		list.add(1, "hi");
		System.out.println("Add new data to ArrayList : " + list);
		
		List list1 = new ArrayList<>();
		list1.add("abc");
//		ဒီနေရာမှာ စသတိထားပါ list1 ထဲကို အပေါ်က list ကိုထပ်ထည့်လိုက်တာမို့ list ရဲ့တန်ဖိုးတွေ set လိုက်ကြီးက array တစ်ခန်းအနေနဲ့ list1 ထဲဝင်သွားတယ်
//		list1 ထဲမှာ array နှစ်ခန်းပဲဖြစ်သွားတယ်
		list1.add(list);
		System.out.println("Arraylist.add() : " + list1);
//		ဒါပေမယ့် list1 ထဲကို list ထဲက တန်ဖိုးတွေသီးသန့်ပဲဝင်စေချင်တယ်ဆိုရင် addAll() method ကိုသုံးပေးရတယ်
		list1.addAll(list);
		System.out.println("Arraylist.addAll() : " + list1);
		
//		Arrays.asList(null) ဆိုတာသည် list ထဲကို array ပုံစံအတိုင်း data တွေတန်းထည့်ချင်ရင်သုံးတယ်
		List list3 = Arrays.asList(5, 6, 7);
		System.out.println("Arrays.asList() : " + list3);
		
		
		
		
		
	}

}
