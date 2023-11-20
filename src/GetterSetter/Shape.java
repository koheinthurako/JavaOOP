package GetterSetter;

public class Shape {
	
//	private လို့ကြော်ညာထားရင် သူ့ class ထဲမှာပဲတန်ဖိုးတွေကို ယူသုံးလို့ရတယ် အပြင်ကယူချင်ရင် getter setter ဆောက်
//	ဒီမှာက static method ကနေ output ထုတ်ချင်တာမို့ static ဆိုပြီး test မှာထည့်ရေးပေးဖို့လိုတယ်
	private static int test = 10;
	
	public static void main(String[] args) {
		
//		ဒီနေရာမှာ sq1 & sq2 object နှစ်ခုစလုံးက Square.java ထဲက width တန်ဖိုးကို ကိုယ်စီထည့်လိုက်တယ်
//		တကယ်အလုပ်လုပ်သွားတော့ width တန်ဖိုးသည် sq1 နဲ့ sq2 အတွက် တစ်ခုနဲ့တစ်ခု မတူတော့ပဲ width ကို duplicate လုပ်ပေးသွားတယ် 
		
		Square sq1 = new Square(1, 3, 3);
		sq1.setWidth(100);
		System.out.println(sq1);
		System.out.println("test " + test);
		
		Square sq2 = new Square(5, 7, 6);
		sq2.setWidth(15);
		System.out.println("sq2 " + sq2.getWidth());
		System.out.println("sq1 " + sq1.getWidth());
		
	}

	
	
}
