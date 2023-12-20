package API;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class MoreAboutCollection {

	public static void main(String[] args) {

//		LinkedList အကြောင်းစမယ်
//		linked list သည် data ကို pointer အနေနဲ့သိမ်းသည်
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		System.out.println("LinkedList getFirst() : " + list1.getFirst());
		
		Stack<Integer> list3 = new Stack<>();
		list3.add(1);
		list3.add(2);
		list3.push(3);
		System.out.println("Stack pop() : " + list3.pop());
		
		
//		Set => List နဲ့ Set သည် level တူသည်
//		set သည် duplicate data တွေကိုပယ်ချင်တယ်ဆိုရင် သုံးတယ်
		
		
//		1. HashSet
		System.out.println("---------- Start HashSet ----------");
		Set<Integer> set = new HashSet<Integer>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set ထဲကို random ခေါက်ထည့်မယ်
		Random r = new Random();
//		set ထဲကို 5 လုံးမပြည့်မချင်း looping ပတ်ပြီးထည့်မှာမို့ for loop ကိုသုံးရင် condition ကအသေဖြစ်သွားမယ်
//		အဲ့တာကြောင့် set size မပြည့်မချင်း looping ပတ်မှာမို့ while ကိုသုံးတယ်
		System.out.print("Before auto sorting : ");
		while(!(set.size()==5)) {
			int random = r.nextInt(10);
			System.out.print(random);
			set.add(random);
		}
		System.out.println("\nCollected random numbers in hashSset after sorting : " + set);
//		သတိထားရမှာက HashSet သည် set ထဲကိုသိမ်းသည့်အခါ auto ငယ်စဉ်ကြီးလိုက် sorting စီပေးသွားတယ် ထည့်ချင်တဲ့အတိုင်းမဝင်တော့ပါ
		
		
//		2. LinkedHashSet
		System.out.println("---------- Start LinkedHashSet ----------");
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		System.out.print("LinkedHashSet before saving : ");
		while(!(set2.size()==5)) {
			int random = r.nextInt(10);
			System.out.print(random);
			set2.add(random);
		}
		System.out.println("\nCollected random numbers in linkedHashSet after saving : " + set2);
//		LinkedHashSet ကတော့ duplicate တွေကိုပယ်ပြီးရင် data ထည့်တဲ့အတိုင်းပဲ sorting ချသွားတယ်
		
		
//		Collection Map အကြောင်းစမယ်
		System.out.println("---------- Start Collection Map ----------");
//		map သည် key, value ဆိုပြီးအစုံလိုက်သိမ်းသည် အဲ့လို အစုံလိုက်ကို entry လို့ခေါ်တယ်
//		key ကတော့ data တွေကို Set လိုပဲ ထပ်လို့မရဘူး value ကတော့ ထပ်လို့ရတယ်
		Map<Integer, Character> map1= new HashMap<Integer, Character>();
//		data ထည့်ရင် put
		map1.put(1, 'a');
		map1.put(2, 'c');
//		key 1 နေရာမှာ တန်ဖိုးပြောင်းသွားတယ် replace လုပ်လိုက်တဲ့သဘော
		map1.put(1, 'b');
		map1.put(3, 'a');
		map1.put(4, 'd');
		System.out.println("Collections Map : " + map1);
		map1.remove(3);
		map1.putIfAbsent(3, 'e');
		System.out.println("Collections Map using remove : " + map1);
		System.out.println("Collections Map using get() : " + map1.get(2));
		
//		တစ်ခုချင်းစီဆွဲထုတ်ပြီး looping ပတ်မယ်ဆိုရင် အရင်ဆုံး Set ထဲကိုစုမယ်
//		entry တစ်ခုချင်းစီထည့်မှာမို့လို့ data type က entry အမျိုးအစား သူ့ထဲမှာမှ data type တွေက integer, character 
		Set<Entry<Integer, Character>> mapToSet = map1.entrySet();
		System.out.println("Map entry to set : " + mapToSet);
//		looping စပတ်မယ်ဆိုရင် Collections အတွက်သီးသန့်ထုတ်ထားတဲ့ Iterator class ရှိတယ်
//		သူက ပတ်မယ့် variable ကို Iterator class ထဲက iterator() method ကိုသုံးပေးရတယ်
		Iterator<Entry<Integer, Character>> it = mapToSet.iterator();
//		Iterator ကို loop ပတ်မယ်ဆိုရင် while ကိုသုံးတယ်
		System.out.println("Iterator loop ------------");
		while(it.hasNext()) {
//			it.hasNext() ဆိုတာက looping ထဲကိုမဝင်ခင် pointer က အောက်ဆုံးမှာထောက်တားတယ်
//			looping စတာနဲ့ အပေါ်က index 0 မှာ value ရှိမရှိစစ်ဆေးတယ် ရှိတယ်ဆိုရင် next() ဆိုတဲ့ method ကနေ pointer ကိုရွှေ့သွားပြီး 
//			အဲ့ထဲက value တွေကို entry တစ်ခုဆောက်ပြီး entry ထဲထည့်လိုက်တယ် 
			Entry<Integer, Character> entry = it.next();
			System.out.println("Key is " + entry.getKey() + " : Value is " + entry.getValue());
		}
		
		
	}

}
