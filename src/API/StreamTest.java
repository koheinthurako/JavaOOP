package API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

//		ဒီနေရာမှာ Stream() အကြောင်းစမယ်

//		Stream() ဆိုတာ array တို့ list တို့လို data structure တစ်ခုမဟုတ်ပဲ 
//		Collection ထဲက data တွေကို ဘယ်လိုပုံစံ calculate လုပ်မလဲဆိုပြီး code ရေးတဲ့အခါမှာသုံးတဲ့ JAVA API တစ်ခုပဲ
//		collection တွေပေါ်မူတည်ပြီးမှ အလုပ်လုပ်နိုင်တယ်

//		1. Stream တစ်ခုတည်ဆောက်ခြင်း
//		Normal String
		Stream<Integer> stream1 = Stream.of(100, 200, 300);
//		forEach သည် stream1 ထဲကတန်ဖိုးတွေကို တစ်ခုခြင်း loop ပတ်ပြီးထုတ်ပေးခြင်း အောက်မှာ forEach() အသေးစိတ်ထပ်လာမယ်
		stream1.forEach(x -> System.out.println(x));

//		String using array
		String[] arr = { "a", "b", "c" };
		Stream<String> stream2 = Stream.of(arr);
		stream2.forEach(x -> System.out.println(x));

//		String using collection
		List<Character> list = Arrays.asList('d', 'e', 'f');
//		collection ဆိုရင်တော့ အပေါ်က array လို stream ထပ်ဆောက်စရာမလိုဘူး list ကိုအခြေခံပြီး stream ထပ်သုံးရုံပဲ
		list.stream().forEach(x -> System.out.println(x));
//		collection တွင် stream ကိုသုံးလိုက်လျှင် result တစ်ခုခုကိုပြန်ထုတ်ပေးတာမျိုး/ list ရဲ့တန်ဖိုးတစ်ခုခုပြောင်းသွားတာမျိုးတွေဖြစ်စေတယ်

		
		
//		1. forEach() အကြောင်းစမယ်
		List<Integer> list2 = Arrays.asList(2, 3, 5, 1, 0);
//		list2.stream().forEach() ထဲက forEach() parameter ထဲမှာ consumer ဆိုတဲ့ method ကိုသုံးထားပြီး သူ့ရဲ့ return type က void

//		အဲ့တော့ Consumer အလုပ်လုပ်ပုံကိုအောက်မှာကြည့်မယ်
//		Consumer က java.util.function ထဲမှာရှိတဲ့ interface တစ်ခု Java 1.8 နောက်ပိုင်းမှပေါ်လာပြီး နာမည်ကြီးလာတယ်
//		consumer က interface ဆိုတော့ object ဆောက်မရလို့ anonymous class ကိုသုံးတယ်
//		consumer ထဲမှာ method ကလည်းတစ်ခုပဲပါတယ် accept() ဆိုတဲ့ void method
//		Consumer<Integer> con = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println("Consumer anonymous accept() : " + ++t);
//			}
//		};
		
//		consumer မှာပါတဲ့ method က တစ်ခုတည်းဆိုတော့ lambda သုံးလို့ရတယ်
		Consumer<Integer> con = (t -> System.out.println("Consumer lambda accept() : " + ++t));
		con.accept(1);
//		ဒါက consumer ရဲ့ အလုပ်လုပ်ပုံဖြစ်တယ် အဲ့က accept() method ကို forEach() parameter ထဲမှာ လာခေါ်ထားခြင်းဖြစ်တယ်
//		အဲ့တော့ list2 ထဲက တန်ဖိုးတွေကို forEach ကနေတစ်ခုတည်း looping ပတ်ရင်း calculation ကို consumer ထဲက accept method ထဲမှာ
//		lambda နည်းပညာသုံးရေးပြီးတော့ တွက်ထုတ်နိုင်တယ်
		list2.stream().forEach(t -> System.out.print(++t));
//		သို့သော် မူရင်း original list2 ထဲက တန်ဖိုးတွေကတော့ မပြောင်းလဲပါ
		System.out.println("\nOriginal list2 : " + list2);
		
		

	}

}
