package Inheritence;

public class Shape {
	
//	private လို့ကြော်ညာထားရင် သူ့ class ထဲမှာပဲ�?န်ဖိုး�?ွေကို ယူသုံးလို့ရ�?ယ် အပြင်ကယူ�?ျင်ရင် getter setter ဆောက်
//	ဒီမှာက static method ကနေ output ထု�?်�?ျင်�?ာမို့ static ဆိုပြီး test မှာထည့်ရေးပေးဖို့လို�?ယ်
	private static int test = 10;
	
	public static void main(String[] args) {
		
//		ဒီနေရာမှာ sq1 & sq2 object နှစ်�?ုစလုံးက Square.java ထဲက width �?န်ဖိုးကို ကိုယ်စီထည့်လိုက်�?ယ်
//		�?ကယ်အလုပ်လုပ်သွား�?ော့ width �?န်ဖိုးသည် sq1 နဲ့ sq2 အ�?ွက် �?စ်�?ုနဲ့�?စ်�?ု မ�?ူ�?ော့ပဲ width ကို duplicate လုပ်ပေးသွား�?ယ် 
		
		Square sq1 = new Square(1, 3, 3);
		sq1.setWidth(100);
		System.out.println("toString " + sq1);
		System.out.println("test " + test);
		
		Square sq2 = new Square(5, 7, 6);
		sq2.setWidth(15);
		System.out.println("sq2 " + sq2.getWidth());
		System.out.println("sq1 " + sq1.getWidth());
		
	}

	
	
}
