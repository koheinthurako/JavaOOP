package API;

import java.util.HashSet;
import java.util.LinkedList;
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
		System.out.println("\nCollected random numbers in set after soring : " + set);
//		သတိထားရမှာက HashSet သည် set ထဲကိုသိမ်းသည့်အခါ auto sorting စီပေးသွားသည်
		
		
	}

}
