package API;

//	ဒီနေရာမှာ Java.lang ရဲ့ Object တွေအကြောင်းစမယ် 

class Point implements Cloneable{

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
//		ဒီနေရာမှာသတိထားပါ!!! 
//		ဒီ Point class သည် Java.lang ထဲက Object class ကို child အနေနဲ့ extends inheritance လှမ်းလုပ်ထားတယ်
//		ဒါပေမယ့် ရေးထားတာကို မမြင်ရဘူး Object တို့ String တို့ကို import မလုပ်ပဲ သုံးနိုင်နေရခြင်းသည် Java.lang package သည်
//		class တွေက သူနဲ့ချိတ်ဆက်ထားကြောင်းကို မမြင်နိုင်အောင် ဖွက်ပြီးရေးထားတာကို သိထားရမယ်
//		ဒီနေရာမှာ (Object obj) ဆိုတာ Java.lang.Object class က Parent အနေနဲ့ဖြစ်နေလို့ Point class မှာ ယူသုံးချင်ရင်
//		Down Casting PolyMorphism ကိုသုံးပြီး ပြောင်းလိုက်တယ် အဲ့လိုပြောင်းလိုက်တော့မှ Point class ထဲက x, y တွေခေါ်သုံးလို့ရမယ်
		Point p = (Point)obj;
//		ဒီနေရာမှာအောက်က this keyword ကို သတိထားကြည့်ပါ!
//		this ဆိုတာသည် ဒီ equals() method ကိုခေါ်လိုက်သည့် object နဲ့ဆိုင်သွားတယ် အခုဆိုအောက်က p1 က ဒီ method ကိုလှမ်းခေါ်လိုက်သည့်အတွက်
//		this.x & this.y က p1.x & p1.y သဘောမျိုးဖြစ်တယ် Parameter ထဲက Object obj ကတော့ p3 ဖြစ်ပြီး အပေါ်မှာ p ဆိုပြီး ပြောင်းထားလို့
//		p1 & p3 object အထဲက တန်ဖိုးတွေနှိုင်းယှဉ်ခြင်းဖြစ်တယ်
		return this.x==p.x & this.y==p.y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ObjectTest {

	public static void main(String[] args) throws CloneNotSupportedException {

//		p1 ဆိုတဲ့ Point Object တစ်ခုကိုဆောက်လိုက်တယ်
		Point p1 = new Point(1, 2);
		
//		ပြီးတော့ p2 Point အသစ်ကို p1 နဲ့သွားတူလိုက်ပြီး အောက်မှာ output ထုတ်လိုက်တယ်
//		ဒီနည်းကို "Shadow Copy" လို့ခေါ်တယ်
		Point p2 = p1;
		
//		ဒီအထိက ပုံမှန်ပဲလို့ထင်နိုင်ပေမယ့် တကယ့်တကယ် Object တွေဘယ်လိုအလုပ်လုပ်ကြလဲသတိထားကြည့်ရမယ် p2 က new Constructor မခေါ်ဘဲ p1 နဲ့သွားတူလိုက်တဲ့အခါ
//		p1 သည် Point Constructor ကိုသုံး values တွေထည့်ပြီး p1 ဆိုတဲ့ Object ကြီးတစ်ခုကို memory ပေါ်မှာ သူ့ဘာသာ ဆောက်လိုက်တယ်
//		သို့သော် p2 က p1 နဲ့သွားတူလိုက်တော့ memory ပေါ်က p1 object ရဲ့ memory address ကို p2 ကပါ Reference သွားလုပ်လိုက်ခြင်းဖြစ်တယ်
		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);

//		ဒါကြောင့် ဒီနေရာမှာ p1 ရဲ့ x တန်ဖိုး ကို ပြောင်းလိုက်တော့ p2 ကပါ same address ဖြစ်နေလို့ တန်ဖိုးတွေကလိုက်ပြောင်းနေခြင်းဖြစ်တယ်
		p1.setX(3);
		p2.setY(5);
		System.out.println("--- Soft Copy Test ---");
		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);

//		ဒီနေရာမှာ ပြောချင်တဲ့အရာက Object တွေကို condition စစ်ရင် သူတို့အထဲက value တွေပေါ်မမူတည်ပဲ သူတို့ရဲ့ memory address တွေတူကြလား
//		Object ချင်းတူကြလားဆိုပြီး စစ်ခြင်းဖြစ်တယ် "==" ရဲ့သဘောသည် သုံးထားကြတဲ့ Reference တွေတူကြလားဆိုတာစစ်ခြင်းဖြစ်တယ်
//		ဆိုတော့ "==" သည် Primitive DataTypes တွေကို condition စစ်ရာတွင်ပဲသုံးပြီး Object တွေကို condition စစ်ရင်မသုံးပါ
		System.out.println(p1 == p2 ? "Equal" : "Not Equal");
		
//		Object တွေရဲ့ Data တွေတူမတူကို စစ်ချင်ရင်တော့ ဟိုးအပေါ် Point Class ထဲမှာ Java.lang package ထဲက toString() လိုမျိုး
//		equals ဆိုတဲ့ Java.util.Object class ထဲက equals method ကို Override လုပ်ပြီးပြန်ရေးပေးမှရမယ်
//		ဒီမှာ နောက်ထပ် p3 ဆိုတဲ့ object တစ်ခုကို constructor သုံးပြီးတော့ ဆောက်လိုက်တယ် ပြီးတော့ အောက်မှာ p1.equals(p3) ဆိုပြီး
//		Java.lang.Object class ထဲက equals() method ကို အပေါ်မှာလှမ်းခေါ်လိုက်တယ် အပေါ်က Override ကိုထပ်ကြည့်ပါ 
		Point p3 = new Point(p1.getX(), p1.getY());
//		ဒီလို object အသစ်တစ်ခုရဲ့ value ကို တခြား object တစ်ခုရဲ့ တန်ဖိုးတွေနဲ့အတူတူပေးချင်လို့ dynamic သုံးလိုက်ခြင်းကို "Deep Copy" လို့ခေါ်တယ်
		System.out.println("p1 " + p1);
		System.out.println("p3 " + p3);
		System.out.println(p1.equals(p3) ? "Equal" : "Not Equal");
		
//		ဒီနေရာမှာ p3 တန်ဖိုးကိုပြောင်းလိုက်လို့ Not Equal ပြန်ဖြစ်သွားတယ်
		p3.setX(10);
		System.out.println("--- Deep Copy Test ---");
		System.out.println("p1 " + p1);
		System.out.println("p3 " + p3);
		System.out.println(p1.equals(p3) ? "Equal" : "Not Equal");
		
//		အကျဉ်းချုပ်ကတော့ Object, String တွေကို condition စစ်ရင် Java.lang.Object ထဲက equals() method နဲ့တိုက်စစ်တယ်
//		Primitive DataTypes တွေဆိုရင်တော့ ပုံမှန်အတိုင်း comparison operator တွေသုံးတယ်
//		သို့သော် Shadow Copy ကော Deep Copy ကော နှစ်ခုစလုံးက Coding တွေအများကြီး လိုက်ရေးနေရလို့ အားနည်းချက်တွေရှိတယ်
//		ဒါကြောင့် Object.Clone() ဆိုတဲ့ နည်းလမ်းကိုသုံးတယ် Clone အကြောင်းဒီမှာစမယ်
		
//		Clone စလုပ်မယ်ဆိုရင် ဒီ class ကို Java.lang package ထဲမှာရှိတဲ့ Cloneable ဆိုတဲ့ interface ကို implements လှမ်းလုပ်ပေးရတယ်
		Point p4 = (Point) p1.clone();
		System.out.println("--- Clone Test ---");
		System.out.println("p1 " + p1);
		System.out.println("p4 " + p4);
		System.out.println(p1.equals(p4) ? "Equal" : "Not Equal");
		
//		ဒီနေရာမှာ p4 ကို အပေါ်က p1 clone ပြီးလုပ်ထားပြီး p4 x တန်ဖိုးကိုပြောင်းလိုက်တော့ "Deep Copy" အတိုင်း result ထွက်လာတယ်
		p4.setX(10);
		System.out.println("--- Clone Test that change p4 x value ---");
		System.out.println("p1 " + p1);
		System.out.println("p4 " + p4);
		System.out.println(p1.equals(p4) ? "Equal" : "Not Equal");

/*
	အဲ့တော့ clone အကြောင်းပြန်ရှင်းမယ် clone ကိုသုံးမယ်ဆိုရင် မူရင်း class မှာ Cloneable interface ကို implements(import) လှမ်းလုပ်ရမယ်
	ပြီးတော့ override လုပ်ထားတဲ့ clone() method မှာ throws CloneNotSupportedException ဆိုပြီးထည့်ပေးရတယ် အဲ့တာကို နောက်အပိုင်းမှာရှင်းမယ်
	အဲ့လို throws ပစ်လိုက်ရင် throws ပစ်ထားတဲ့ method တစ်ခုကို တခြားတစ်နေရာက လှမ်းခေါ်ရင် အဲ့ခေါ်တဲ့ method မှာလည်း throws ထပ်ပစ်ပေးရမယ်
	အဲ့လိုသာ throws မပစ်ပေးရင် compile time error တက်မယ်
	
	ပြီးသွားရင် Point p4 = (Point) p1.clone(); ဒီလိုခေါ်ပေးရတာက clone() method ရဲ့ return က Object DataTypes ဖြစ်တယ်
	return ရဲ့ Object က p1.clone() ထဲကိုဝင်လာတယ် ပြီးတော့ Object ကနေ Point ကို Down Casting ပြန်ချိန်းလိုက်ပြီး
	တန်ဖိုးကို p4 ထဲထည့်လိုက်တယ် အဲ့တော့ သဘောက p4 သည် Java.lang ထဲက clone() method ရဲ့ return ပြန်လာတဲ့ Object တန်ဖိုးကို
	Point အနေနဲ့ ပြန်ပြောင်းလိုက်ပြီး Point ထဲက method တွေ variables တွေအကုန်လုံးကို သုံးနိုင်သွားခြင်းဖြစ်တယ် အဲ့ဒါကြောင့် p4.setX() ဆိုတဲ့
	method တွေပြန်သုံးနိုင်တယ် ပြီးတော့ Data တွေ အချိန်းအပြောင်းလုပ်လိုက်တဲ့အခါ ထွက်လာတဲ့ clone သုံးခြင်းရဲ့ result က Deep Copy နဲ့ သွားတူနေတယ်
 */
		
		
//		Object String အကြောင်းစမယ် String သည် Java.lang package အောက်မှာရှိတယ်
//		Object ဖြစ်တဲ့ String ထဲမှာလည်း method တွေအများကြီးရှိတယ်
		String st = "Hello World";
//		ဒီနေရာမှာ တကယ်တော့ String သည် Java မှာရေးထားပြီးသား Non-primitive Type class တစ်ခုဖြစ်တယ်
//		အဲ့တာကို st ဆိုပြီး အပေါ်မှာ object ဆောက်ထားတာ ပုံမှန်ဆို object တစ်ခုဆောက်ရင် constructor ကိုလှမ်းခေါ်ရတယ်ဆိုပေမယ့်
//		String ကတော့ အသုံးများလို့ "" Double Code လေးနဲ့ ရေးရုံဖြင့် တန်ဖိုးတွေထည့်ပေးနိုင်အောင် လုပ်ပေးထားခြင်းဖြစ်တယ် 
//		အဲ့တာကို Systematically ရေးမယ်ဆိုရင်တော့ String st = new String("Hello World"); ဆိုပြီးရေးတယ်
		
		String st2 = st.concat(" hi");
		System.out.println(st2);
		System.out.println(st.toUpperCase());
		System.out.println(st);
//		String တွေသည် အပေါ်ကအတိုင်း တန်ဖိုးတစ်ခုထည့်လိုက်ရင် အဲ့အတိုင်းပဲရှိနေပြီး သူ့ကိုသုံးပြီး ဘယ်လို calculation လုပ်လုပ် assign မလုပ်မချင်း
//		မူရင်း string တန်ဖိုးကမပြောင်းပါ အဲ့ဒီသဘောတရားကို immutable ဖြစ်တယ်လို့ခေါ်တယ် (Strings objects are immutable)!
		System.out.println(st.compareTo(st2));
		
//		StringBuilder အကြောင်းစမယ် string builder, string buffer တို့က မူရင်း တန်ဖိုးကို ပြောင်းလဲစေတဲ့ object တွေဖြစ်တယ်
//		သူတို့ Object ထဲက method တွေကိုသုံးတာနဲ့ မူရင်း string တန်ဖိုးတစ်ခုလုံးက assign မလုပ်ပဲနဲ့ ပြောင်းလဲသွားတယ်
//		StringBuilder တို့ StringBuffer တို့ကို mutable ဖြစ်တယ်လို့ခေါ်တယ်
		StringBuilder st3 = new StringBuilder("Hello ");
		st3.append("Ko Hein");
		System.out.println(st3);
		
//		ပြီးရင် သူတို့ရဲ့ method တွေအကြောင်းကို ဆိုင်ရာ class တွေမှာ ဆက်ကြည့်ပါ
		
	}

}