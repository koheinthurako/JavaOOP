package API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

//		ဒီနေရာမှာ Stream() အကြောင်းစမယ်

//		Stream() ဆိုတာ array တို့ list တို့လို data structure တစ်ခုမဟုတ်ပဲ 
//		Collection ထဲက data တွေကို ဘယ်လိုပုံစံ calculate လုပ်မလဲဆိုပြီး code ရေးတဲ့အခါမှာသုံးတဲ့ JAVA API တစ်ခုပဲ
//		collection တွေပေါ်မူတည်ပြီးမှ အလုပ်လုပ်နိုင်တယ်

//		1. Stream တစ်ခုတည်ဆောက်ခြင်း
//		Normal String
//		forEach သည် stream1 ထဲကတန်ဖိုးတွေကို တစ်ခုခြင်း loop ပတ်ပြီးထုတ်ပေးခြင်း အောက်မှာ forEach() အသေးစိတ်ထပ်လာမယ်
//		Stream<Integer> stream1 = Stream.of(100, 200, 300);
//		stream1.forEach(x -> System.out.println(x));

//		String using array
//		String[] arr = { "a", "b", "c" };
//		Stream<String> stream2 = Stream.of(arr);
//		stream2.forEach(x -> System.out.println(x));

//		String using collection
//		collection ဆိုရင်တော့ အပေါ်က array လို stream ထပ်ဆောက်စရာမလိုဘူး list ကိုအခြေခံပြီး stream ထပ်သုံးရုံပဲ
//		List<Character> list = Arrays.asList('d', 'e', 'f');
//		list.stream().forEach(x -> System.out.println(x));
		
		
//		collection တွင် stream ကိုသုံးလိုက်လျှင် result တစ်ခုခုကိုပြန်ထုတ်ပေးတာမျိုး/ list ရဲ့တန်ဖိုးတစ်ခုခုပြောင်းသွားတာမျိုးတွေဖြစ်စေတယ်

		
//		1. forEach() အကြောင်းစမယ်
		List<Integer> list2 = Arrays.asList(2, 3, 5, 1, 0);
		
//		list2.stream().forEach() ထဲက forEach() parameter ထဲမှာ Consumer ဆိုတဲ့ class ကိုသုံးထားပြီး သူ့ရဲ့ return type က void
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
		System.out.print("Start forEach loop method : ");
		list2.stream().forEach(t -> System.out.print(++t));
//		သို့သော် မူရင်း original list2 ထဲက တန်ဖိုးတွေကတော့ မပြောင်းလဲပါ
		System.out.println("\nOriginal list2 : " + list2);
		
		
		
		
//		2. map အကြောင်းစမယ် 
//		map() ကတော့ ပေးလိုက်တဲ့တန်ဖိုးတွေကို calculation လုပ်ပြီးမှ stream() အနေနဲ့ return ပြန်ထုတ်ပေးတယ်
//		list2.stream().map() ထဲက map() parameter ထဲမှာ Function ဆိုတဲ့ class ကိုသုံးထားတယ်
//		အဲ့တော့ Function အလုပ်လုပ်ပုံကိုအောက်မှာကြည့်မယ်
//		Consumer က java.util.function ထဲမှာရှိတဲ့ interface တစ်ခု သူ့ထဲမှာ type parameter 2 လုံးပါတယ်
//		Function ထဲမှာ method ကလည်းတစ်ခုပဲပါတယ် apply() ဆိုတဲ့ method
//		type parameter အရှေ့ဆုံးတစ်လုံးက apply() parameter ထဲကို calculation အတွက်ဝင်သွားပြီး နောက်ဆုံး type parameter ကတော့
//		return type အနေနဲ့ အလုပ်လုပ်တယ်
//		Function<Integer, Character> fun = new Function<Integer, Character>() {
//			@Override
//			public Character apply(Integer t) {
//				return (char) (t + 65);
//			}
//		};
//		System.out.println("Function apply() method for map : " + fun.apply(0));
		
//		method က တစ်ခုတည်းဆိုတော့ lambda သုံးလို့ရတယ်
		Function<Integer, Character> fun = (t -> (char) (t + 65));
		System.out.println("Function apply() method for map using lambda : " + fun.apply(0));
		
//		forEach နဲ့ map ကွာခြားချက်က forEach က return void မို့ ဖမ်းမိလိုက်တဲ့ တန်ဖိုးမရှိပဲ console မှာ loop ပတ်ထုတ်ပြဖို့ကိုဦးစားပေးတယ်
//		map ကတော့ stream() တစ်ခုကို return ပြန်ပေးတယ် ပြန်ပေးတဲ့ တန်ဖိုးတွေကို စုဖို့ array (or) collection ထပ်လိုတယ် အောက်မှာကြည့်ပါ
//		အပေါ်က apply() ထဲမှာ တွက်ချက်ပြီး return ပြန်လာတာတွေကို Character တွေမို့ List<Character>
//		အောက်က အဆင့်ဆင့်ရေးထားတဲ့ပုံစံကို pipeline ပုံစံရေးတယ်လို့ခေါ်တယ်
		List<Character> chars = list2
				.stream()
				.map(t -> (char) (t + 65))
				.collect(Collectors.toList());
		System.out.println("map method by collecting using Collectors.toList() : " + chars);
		System.out.println("Original Value list2 : " + list2);
//		ဒါဆိုရင်တော့ map ကို သုံးပြီး integer collection တစ်ခုကို calculation လုပ်ပြီး character return ပြန်လာတာတွေကို
//		Collectors.toList() ကိုထပ်သုံးပြီး တန်ဖိုးတွေကိုစုပြီးမှ print ပြန်ထုတ်တယ် value တွေက လုံးဝကွဲထွက်ပြီးထွက်လာပေမယ် 
//		မူရင်း list2 ထဲကတန်ဖိုးတွေတော့ လုံးဝမပြောင်းလဲပါ collector တစ်ခုကိုထပ်သုံးလိုက်လို့ return တန်ဖိုးတွေကသာ collection အသစ်တစ်ခုအနေနဲ့ပွားသွားတယ်

	}

}
