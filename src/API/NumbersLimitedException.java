package API;

import java.util.Scanner;

public class NumbersLimitedException {
	
//	User Defined Handling အကြောင်းစမယ်
	
//	ကိုယ်ပိုင် exception handling တစ်ခုကိုဖန်တီးမယ် user ဆီက integer input တစ်ခုတောင်းမယ်
//	input က 1-10 ထဲကမဟုတ်ရင် လက်မခံတဲ့ exception program တစ်ခုရေးမယ်
//	ကိုယ်ပိုင် exception မို့လို့ class တစ်ခုခွဲရေးပြီး Java ကရေးထားပြီးသား Exception class ကို extends လုပ်မယ်

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumbersLimitedExceptionClass, InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 1-10 : ");
		int input = sc.nextInt();
//		ပြီးရင် ဒီနေရာမှာ class တစ်ခုအောက်မှာ ခွဲဆောက်လိုက်တာမို့လို့ constructor နဲ့ object တစ်ခုဆောက်ပြီး throw ပစ်လိုက်တယ်
//		သတိထားပါ ကိုယ်ပိုင် exception တွေမှာ throw လုပ်ရင် "s" မပါဘူး parent method ကနေ throws ပေးရရင် "s" ပါတယ်
//		အောက်မှာ error အဝါလိုင်းလေးတက်နေတယ် ဘာလို့ဆို sc.close() က အောက်ဆုံးမှာရေးထားတော့ အောက်က condition false ပြီး
//		NumbersLimitedExceptionClass ထဲကိုရောက်သွားရင် sc.close() ကမလုပ်လိုက်ရလို့ အဲ့တာကြောင့် အဝါ error လိုင်းကို
//		main method အပေါ်မှာ @SuppressWarnings("resource") ဆိုပြီး ပိတ်နိုင်တယ်
//		@ sign ကို Annotations လို့ခေါ်တယ်
		if(input < 0 | input > 10) throw new NumbersLimitedExceptionClass("Now in limited");
		System.out.println("--- Working ---");
		sc.close();
		
//		အောက်မှာ method propagation နည်းနဲ့ program တွေကို ဆောက်ထားတယ် အလုပ်လုပ်သွားပုံကိုကြည့်ပါ
//		အရင်ဆုံး method1() ထဲက method2() ကိုသွားခေါ်တယ် ပြီးတော့ method2() ထဲမှာ error တက်တော့
//		error က line 42 - line 37 - line 31 ဆိုပြီး အောက်ကနေအပေါ် error ပြန်တက်လာတယ် အဲ့တာကို ဖတ်တတ်ဖို့လိုတယ်
		
		method1();
		System.out.println("Ko Hein");
		
	}

	static void method1() throws InterruptedException {
		method2();
		System.out.println("hi");
	}
	
	static void method2() throws InterruptedException {
		Thread.sleep(1000);
	}
	
//	အဲ့လို အဆင့်ဆင့်တတ်တဲ့ error ကို handle လုပ်တာကို exception propagation handling လို့ခေါ်တယ် 
	
}

class NumbersLimitedExceptionClass extends Exception{
	private static final long serialVersionUID = 1L;
	public NumbersLimitedExceptionClass(String msg) {
		System.out.println(msg);
	}
	
}
