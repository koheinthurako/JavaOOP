package API;

//	ဒီနေရာမှာ Java.lang ရဲ့ Object တွေအကြောင်းစမယ် 

class Point {

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

}

public class ObjectTest {

	public static void main(String[] args) {

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
		System.out.println("p1 " + p1);
		System.out.println("p3 " + p3);
		System.out.println(p1.equals(p3) ? "Equal" : "Not Equal");
		
//		အကျဉ်းချုပ်ကတော့ Object, String တွေကို condition စစ်ရင် Java.lang.Object ထဲက equals() method နဲ့တိုက်စစ်တယ်
//		Primitive DataTypes တွေဆိုရင်တော့ ပုံမှန်အတိုင်း comparison operator တွေသုံးတယ်
//		သို့သော် Shadow Copy ကော Deep Copy ကော နှစ်ခုစလုံးက Coding တွေအများကြီး လိုက်ရေးနေရလို့ အားနည်းချက်တွေရှိတယ်
//		ဒါကြောင့် Object.Clone() ဆိုတဲ့ နည်းလမ်းကိုသုံးတယ် Clone အကြောင်းဒီမှာစမယ်

	}

}