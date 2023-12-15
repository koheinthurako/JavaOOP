package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//	Comparable အကြောင်းကိုကျော်ပြီး အောက်ဆုံးကိုဖတ်ပြီးမှ ဒီကိုပြန်လာဖတ်ပါ 
//	Comparable က interface ဖြစ်လို့ သူ့ထဲမှာ implement မလုပ်ရသေးတဲ့ compareTo() method ကို override ပြန်လုပ်ပေးရတယ်
//	Comparable<T> မှာ T က data type တစ်ခုခုကိုထည့်ခိုင်းတာ ထည့်လိုက်တဲ့ data type က compareTo() ထဲကို parameter မှတစ်ဆင့်ဝင်သွားမယ်
class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
//		ဒီနေရာမှာ အောက်က this keyword ကို ဒီ compareTo() ကိုလှမ်းခေါ်လိုက်တဲ့ Object အပေါ်မူတည်ပြီး o ကတော့ parameter ထဲက Object value
//		return this.age-o.age; // integer တွေ sort
		return this.name.compareTo(o.name); // string တွေ sort
	}

}

class Point1<T, S> {
//	T ဆိုတာ unknown data type တစ်ခုဖြစ်တယ် တကယ်တော့ variable တစ်လုံးကို data type အနေနဲ့သုံးလိုက်တဲ့သဘော
	T x;
	S y;

	public Point1(T x, S y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + "]";
	}
	
}

public class CollectionTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

//		ပုံမှန်ဆို array က dataTypes တူတာတွေပဲ ထည့်လို့ရတယ်
//		Collection တွေက dataTypes မတူတာတွေကို array အနေနဲ့ ထည့်လို့ရတယ် သို့သော် Object တွေကိုပဲစုပေးထားနိုင်တယ် primitive တွေမရ

		int[] num = new int[5];
//		ဒီနေရာမှာ new int[5] ဆိုပြီး array အခန်းကိုကြိုကြေညာထားတယ် သဘောက array ကလည်း constructor ကနေခေါ်ထားတဲ့ object တစ်ခုပဲဖြစ်တယ် 
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
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

//		list တစ်ခုထဲက တစ်ခုကို ထည့်ချင်ရင် အောက်ကလိုထည့်လို့ရတယ် သူတို့ Object နှစ်ခု က Deep Copy လို သီးခြားအလုပ်လုပ်တယ် 
		List list4 = new ArrayList<>(list3);
		list4.set(1, 2);
//		set သည် data ကိုပြင်တာ
		System.out.println("ArrayList.set() : " + list4);

		List list5 = new ArrayList();
		list5.add("abc");
		list5.add(123);
		list5.add(true);
		System.out.println(list5);
//		ဒီနေရာက Object နေရာမှာ loop ပတ်ဖို့ DataTypes ကိုထည့်ပေးရမယ် ပုံမှန်ဆိုရင်တော့ List ထည့်ရတယ်
//		ဒါပေမယ့် list5 ထဲကတန်ဖိုးတွေက ပေါင်းစုံဖြစ်နေတော့ class တွေရဲ့ ခေါင်ချုပ် parent ကိုထည့်ရတယ် အဲ့တာက Object
		System.out.print("Arraylist loop - Object data type : ");
		for (Object data : list5) {
			System.out.print(data + " ");
		}

//		list6 ထဲက data တွေကို calculation လုပ်ချင်တယ်
		List<Integer> list6 = Arrays.asList(1, 2, 3, 4, 5);
		int result = 0;
		Collections.shuffle(list6);
		System.out.println("\nCollections.shuffle() : " + list6);
//		ဒါပေမယ့် loop ပတ်မှရမှာဆိုတော့ list6 က object ဖြစ်ပြီး တွက်ရမယ့် တန်ဖိုးတွေက integer တွေဆိုတော့ data type အရင်ညှိရမယ်
//		အဲ့တာကြောင့် list6 ရဲ့ List မှာ list6 ထဲကို integer တွေပဲထည့်မယ်ဆိုပြီး "<Integer>" လို့ကြေညာပေးရတယ် သတိထားရမှာက
//		"<>" အထဲမှာ primitive type "<int>" ဆိုပြီးရေးလို့မရဘူး ဘာလို့ဆို List က object တွေကိုပဲလက်ခံလို့ Wrapper class ဖြစ်တဲ့
//		"<Integer>" လို့ပဲထည့်ပေးရမယ် အဲ့တာမှ data type တူသွားပြီး calculation လုပ်လို့ရမယ် list6 ထဲမှာ string ပါလာရင်တော့အဆင်မပြေဘူး
		for (Integer data : list6) {
			result += data;
		}
		System.out.println("\nList start using data type(wrapper class) for calculation : " + result);

//		ဒါပေမယ့် number အမျိုးအစားတူတဲ့ integer, float, double, long တို့ဆိုရင်တော့ ဒီလိုရေးလို့ရတယ်
		List<Number> list7 = Arrays.asList(1, 2, 3, 4.1, 5.2);
		int count_double = 0;
		int count_integer = 0;
		for (Number data : list7) {
//			data type မတူတာပါလာပေမယ့် number အုပ်စုထဲကဆိုရင်တော့ instanceOf တို့လို condition စစ် data type တွေပြန်ပြောင်းပြီးတွက်နိုင်တယ်
			if (data instanceof Double)
//				instanceOf သည် ဒီမှာ Double Type ဟုတ်မဟုတ် စစ်ခြင်းဖြစ်တယ်
				count_double++;
			if (data instanceof Integer)
				count_integer++;

		}
		System.out.println("List calculation mixed integer and double : " + count_double + " : " + count_integer);

//		Program တစ်ခုရေးမယ် ဟိုးအပေါ်မှာ Person class ရှိတယ်အဲ့ထဲက condition တစ်ခုနဲ့ကိုက်ညီတဲ့လူတွေကိုဆွဲထုတ်ချင်တယ်
//		လူက ဘယ်နှယောက်ပါမှန်းမသိလို့ Collection ကိုသုံးမယ်
//		ဒီတစ်ခါ List collection ထဲကို အောက်က Object တွေစုထည့်ထားတယ်
//		အဲ့ဒီ List ရဲ့ data type က Person data type
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Thet", 20));
		persons.add(new Person(2, "Zaw", 18));
		persons.add(new Person(3, "Hein", 25));

//		ဒီမှာ collection.sort ကိုရိုးရိုးသုံးရင် error တက်မယ် ဘာလို့ဆို sort က data type တူတဲ့ဟာတွေထဲကမှ တန်ဖိုးတစ်ခုထဲကိုပဲနှိုင်းယှဉ်ပြီး sorting လုပ်လို့
//		persons ထဲမှာကျတော့ object တွေ object တွေထဲမှာမှ data က 3 ခုစီပါနေတော့ sort က ဘာကိုထုတ်ပြရမှန်းမသိဘူး
//		ဒါကြောင့် ကိုယ်ပိုင် user defined object တွေကို sorting စီမယ်ဆိုရင်
//		ဟိုးအပေါ်က Person class ထိပ်ဆုံးမှာ Comparable interface class ကို implements လုပ်ပေးရတယ်
		Collections.sort(persons);

//		ဒီ Person data type နေရာမှာ ပုံမှန်ဆို default Object ဆိုပေမယ့် လက်ခံမယ့် data type က
//		ဟိုးအပေါ်က Person class ဖြစ်နေလို့ Person data type တစ်ခါတည်းထည့်လိုက်တယ် 
		for (Person person : persons) {
//			if(person.getAge() < 20)
//				System.out.println(person);
			System.out.println(person);
		}
//			အဲ့တော့ person က Person class ရဲ့ object ဖြစ်သွားပြီး class ထဲက method တွေယူသုံးလို့ရသွားတယ်

//		Collection ဆိုတာတကယ်တော့ ထွေထွေထူးထူးမဟုတ်ပဲ မတူတဲ့ data type တွေကို array လို object အနေနဲ့ စုစည်းထားနိုင်ပြီး
//		လိုအပ်လာရင် Wrapper class တွေသုံးပြီး data type တွေပြောင်းလဲကာ လွယ်လွယ်ကူကူ calculation လုပ်သွားနိုင်တယ်
//		data type တွေကိုလည်း java support ပေးတဲ့ data type တွေအပြင် ကိုယ်ပိုင် class တွေကိုရေးပြီးအပေါ်ကလို data type အနေနဲ့
//		သုံး object ဆောက်ပြီး အသုံးပြုနိုင်တယ်

		
		
//		အပေါ်က Point1 class ကို object ဆောက်မယ် သို့သော် constructor parameter ထဲကို ပေးမယ့် data type ကို အတိအကျမသိလို့
//		generalist အနေနဲ့ Point1 class ထဲမှာ "<T>" ဆိုပြီးရေးလိုက်တယ် သွားကြည့်
//		အဲ့တာကြောင့် အောက်ကအတိုင်း object ဆောက်တဲ့အခါမှာ သုံးမယ့် data type ကိုတစ်ခါတည်းထည့်ပေးလိုက်လို့ရတယ် 
		Point1<Integer, Character> p1 = new Point1<Integer, Character>(1, 'c');
//		object တစ်ခုထဲမှာပဲ မတူတဲ့ data type ပါလာရင်တော့ ပါသလောက် object ဆောက်တဲ့နေရာမှာ အောက်ကလိုထည့်ပေးရပြီး
//		Point1 class မှာလည်း ထိပ်ဆုံးမှာ generalist data type 2 လုံးသွားထည့်ပေးရတယ် သွားကြည့်
		Point1<Double, String> p2 = new Point1<Double, String>(1.2, "Hello");
		System.out.println(p1);
		System.out.println(p2);

	}

}
