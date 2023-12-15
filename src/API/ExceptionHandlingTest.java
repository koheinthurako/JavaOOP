package API;

import java.util.Scanner;

public class ExceptionHandlingTest {

	enum GENDER {
		MALE, FEMALE
	}

	public static void main(String[] args) throws InterruptedException {

//		Types of Exception => 1. User Defined Exceptions 2.Built-In Exceptions
//		2. Built_In Exception => 1. Checked Exceptions 2. Unchecked Exceptions

//		2. Unchecked Exceptions တွေအကြောင်းအောက်မှာကြည့်ပါ
//		Unchecked Exceptions ဆိုတာ coding လုပ်နေချိန် error မတက်ပဲ run လိုက်မှ တက်တဲ့ error 

//		System.out.println(2/0);
//		ဒါဆို runTime error (Arithmetic Exception) တက်တယ် အဲ့တာဆို အောက်က program တွေက မ run နိုင်တော့ဘူး
//		အဲ့တာအတွက် exception handling လုပ်ဖို့လိုတယ်
//		System.out.println("Program Exit");

		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Can't divided by zero!");
		}

//		string တစ်ခုကြေညာတယ် တန်ဖိုးမထည့်ဘဲထားထားတယ်
		String st = null;
//		အဲ့ဒါကို String ထဲက method ဖြစ်တဲ့ length() ကိုယူသုံးလိုက်တော့ တန်ဖိုးမထည့်ရသေးလို့ NullPointerException တက်တယ် အဲ့လိုမဖြစ်အောင် handle လုပ်
		try {
			System.out.println(st.length());
		} catch (NullPointerException e) {
			System.out.println("Please declare string first");
		}

//		1. Checked Exceptions တွေအကြောင်းအောက်မှာကြည့်ပါ
//		Java က multiThread အနေနဲ့ run တယ် Thread.sleep ဆိုတာ အခုလက်ရှိ run နေတဲ့ thread ကို ခဏနားခိုင်းလိုက်တယ်
//		Thread.sleep ကိုသုံးပြီဆိုတာနဲ့ parent method မှာ throw InterrputedException ဆိုပြီး throw လုပ်ခိုင်းတယ်
//		အဲ့တာကြောင့် ဟိုးအပေါ်က main method မှာ throw ပေးရတယ် မ throw ရင် compile time error တက်မယ် အဲ့လို မ run ခင်ပြပေးတဲ့
//		error ကိုထိန်းနိုင်ဖို့ checked exception တွေကိုသုံးတယ်
//		method မှာ throw ပေးရတဲ့ အဓိပ္ပာယ်က Thread.sleep ကို သုံးလိုက်တဲ့ second အတွင်းမှာ လက်ရှိ run နေတဲ့ program ကို error တက်တာတွေ
//		ရှိနိုင်တယ်ဆိုပြီး အသိပေးလိုက်တာကို method က "သိတယ်" ဆိုတဲ့လက်ခံတဲ့သဘောနဲ့ throw ပေးရခြင်းဖြစ်တယ် အဲ့တာကို checked exception လို့ခေါ်တယ်
//		မ run ခင်ကတည်းက ဒီနားမှာ error တက်နိုင်တယ်နော်ဆိုပြီး အသိပေးတဲ့အနေနဲ့ throw ပေးရခြင်းဖြစ်တယ်

		System.out.println("--- Start about Thread.sleep() ---");
		String test = "Hello World";
		for (int i = 0; i < test.length(); i++) {
			System.out.print(test.charAt(i));
			Thread.sleep(50);
		}
		System.out.println("");

//		အောက်မှာသတိထားကြည့်ပါ ပုံမှန်က Scanner ကို အပြင်မှာ ကြေညာရင် ပြန် close() ပေးရတယ် ဒါပေမယ့် 
//		try catch ထဲမှာ Scanner ကို ကြေညာမယ်ဆိုရင်တော့ try က fail သွားတာနဲ့ scanner auto close သွားတယ်
//		try ထဲမှာ catch တွေအများကြီးထည့်လို့ရတယ် အဲ့ဒါကို multiCatch လို့ခေါ်တယ်
//		try(Scanner sc2 = new Scanner(System.in)) {
//			System.out.println("Plese enter a number");
//			int num = Integer.parseInt(sc2.nextLine());
//			System.out.println(num/0);
//		} catch (ArithmeticException e) {
//			System.out.println("Can't divided by zero!");
//		} catch (InputMismatchException e2) {
//			System.out.println("Please enter numbers only!");
//		} finally {
//			System.out.println("Program Exit");
//		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Please enter gender MALE or FEMALE : ");
				GENDER g = GENDER.valueOf(sc.nextLine());
				System.out.println(g.toString());
				break;
			} catch (IllegalArgumentException e2) {
				System.out.println("Please try again...");
			}
		}
		
//		ပြီးရင် NumbersLimitedException ကိုသွားကြည့်ပါ
		
	}

}
