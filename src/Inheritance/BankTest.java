package Inheritance;

public class BankTest {

	public static void main(String[] args) {

		BankAcc acc = new BankAcc("aye aye", 100);
		BankAcc s_acc = new SavingAcc("hla hla", 500, false);
		BankAcc sp_acc = new SpecialAcc("ko ko", 300);
		
		System.out.println(acc);
//		s_acc ကို print ထုတ်လိုက်ပေမယ့် SavingAcc ထဲမှာတော့ toString() method က မရှိဘူး သို့သော် Inheritance လုပ်ထားလို့
//		Parent class က toString() method ကိုသွားခေါ်ပြီး အလုပ်လုပ်သွားတယ်
		System.out.println(s_acc);
		System.out.println(sp_acc);
		
		System.out.println("--- အောက်က polymorphism ပြောင်းပြီး looping ပတ်ပြီး print ထုတ်ထားတာ ---");

		sp_acc.deposit(100);
		acc.withdraw(50);
		
//		SavingAcc ထဲကနေ ငွေထုတ်ရင် အများဆုံး 300 ပဲထုတ်လို့ရမယ် မဟုတ်ရင် ထုတ်မရသည့် program တစ်ခုရေးမယ်ဆိုရင် BankAcc class ထဲက
//		withdraw method ကို SavingAcc အတွက် သီးသန့်ပြန်ရေးရမယ် အဲ့လိုပြန်ပြင်ရေးတာကို method overriding လို့ခေါ်တယ်
		s_acc.withdraw(300);
		
		
		
/*
 	Acc တွေအားလုံးထဲက amount တွေကိုထုတ်ကြည့်ချင်ရင် looping ပတ်ရမယ် သို့သော် looping က
 	dataTypes တူမှပတ်လို့ရလို့ java မှာ class တွေကို dataTypes အနေနဲ့လည်း သုံးလို့ရလို့
 	polymorphism ကိုသုံးပြီး dataTypes တူအောင်အရင်လုပ်ပြီးမှ looping ပတ်လို့ရမယ်  
 	Polymorphism ဆိုတာကတော့ Inheritance Class ရှိတဲ့ class တွေမှာပဲသုံးလို့ရတယ်
 	အပေါ်ဆုံးက object တွေရဲ့ရှေ့ဆုံးက dataTypes တွေကို BankAcc ဆိုပြီးအကုန်အတူတူထားလိုက်တယ်
 	အလုပ်လုပ်ရင်တော့ object တွေက သူနဲ့သက်ဆိုင်တဲ့ constructor ကိုပဲဆောက်ပြီးအလုပ်လုပ်သွားတယ်
 	ရှေ့က dataTypes ကိုပဲပြောင်းလိုက်တာကို up casting polymorphism လို့ခေါ်တယ်
 	ပြီးမှ အောက်ကအတိုင်း BankAcc တွေအကုန်လုံးကို looping ပတ်ပြီး print ထုတ်ချင်တော့ BankAcc ဆိုပြီး dataType တူသွားလို့
 	Array ထဲထည့်ပြီး အောက်ကလို forEach looping ပတ်လိုက်တယ်
 */
		BankAcc [] accs = {acc, s_acc, sp_acc};
		for(BankAcc acc1 : accs) System.out.println(acc1);
		
	}

}
