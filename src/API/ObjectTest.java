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

}

public class ObjectTest {

	public static void main(String[] args) {

//		p1 ဆိုတဲ့ Point Object တစ်ခုကိုဆောက်လိုက်တယ်
		Point p1 = new Point(1, 2);
		
//		ပြီးတော့ p2 Point အသစ်ကို p1 နဲ့သွားတူလိုက်ပြီး အောက်မှာ output ထုတ်လိုက်တယ်
		Point p2 = p1;
		
//		ဒီအထိက ပုံမှန်ပဲလို့ထင်နိုင်ပေမယ့် တကယ့်တကယ် Object တွေဘယ်လိုအလုပ်လုပ်ကြလဲသတိထားကြည့်ရမယ် p2 က new Constructor မခေါ်ဘဲ p1 နဲ့သွားတူလိုက်တဲ့အခါ
//		p1 သည် Point Constructor ကိုသုံး values တွေထည့်ပြီး p1 ဆိုတဲ့ Object ကြီးတစ်ခုကို memory ပေါ်မှာ သူ့ဘာသာ ဆောက်လိုက်တယ်
//		သို့သော် p2 က p1 နဲ့သွားတူလိုက်တော့ memory ပေါ်က p1 object ရဲ့ memory address ကို p2 ကပါ ReFrences သွားလုပ်လိုက်ခြင်းဖြစ်တယ်
		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);

//		ဒါကြောင့် ဒီနေရာမှာ p1 ရဲ့ x တန်ဖိုး ကို ပြောင်းလိုက်တော့ p2 ကပါ same address ဖြစ်နေလို့ တန်ဖိုးတွေကလိုက်ပြောင်းနေခြင်းဖြစ်တယ်
		p1.setX(3);
		p2.setY(5);

		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);

//		ဒီနေရာမှာ ပြောချင်တဲ့အရာက Object တွေကို condition စစ်ရင် သူတို့အထဲက value တွေပေါ်မမူတည်ပဲ သူတို့ရဲ့ memory address တွေတူကြလား
//		Object ချင်းတူကြလားဆိုပြီး စစ်ခြင်းဖြစ်တယ်
		System.out.println(p1 == p2 ? "Equal" : "Not Equal");

	}

}
