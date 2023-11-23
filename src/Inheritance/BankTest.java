package Inheritance;

public class BankTest {

	public static void main(String[] args) {
		
//		Child Constructor ကိုသုံးပြီး Parent DataTypes ကိုသုံးထားရင် "Up Casting Polymorphism"
//		upCasting ကနေ Child DataType & child constructor ကိုပြန်ပြောင်းရင် "Down Casting Polymorphism"

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
		s_acc.withdraw(350);
		
//		Special Acc ထဲကနေ ငွေထုတ်မယ်ဆိုရင် အနည်ဆုံး $10 တော့ ချန်ထားရမယ့် program ကို parent class ထဲက method ကို override လုပ်ပြီးရေးမယ်
		sp_acc.withdraw(420);
		
/*
		SavingAcc အတွက် သီးသန့်အတိုးတွက်ခြင်း program တစ်ခုကိုရေးမယ် ဒါပေမယ့် s_acc သည် constructor ကတော့ သူ့ class အတိုင်းအလုပ်လုပ်သွားပေမယ့်
		DataTypes က BankAcc ဖြစ်နေလို့ SavingAcc ထဲက အသစ်တိုးတဲ့ method တွေကိုတော့ လှမ်းခေါ်လို့မရတော့ဘူး
		အဲ့ဒါဆိုရင် "Down Casting Polymorphism" ဆိုတဲ့နည်းကို သုံးရမယ် ဒါဆို အောက်ကလို BankAcc DataType ဖြစ်တဲ့ s_acc ကို
		object အသစ်တစ်ခုဆောက်လိုက်ပြီး ("className") ထဲမှာ ပြောင်းချင်တဲ့ className ကိုရေးလိုက်ရင် DataTypes ကမူရင်း class ကိုပြန်ပြောင်းသွားတယ်
		အဲ့ဒါက "Down Casting Polymorphism".
*/
//		SavingAcc sv_acc = (SavingAcc) s_acc;
//		sv_acc.calcInterest();
		
/*
 	Acc တွေအားလုံးထဲက amount တွေကိုထုတ်ကြည့်ချင်ရင် looping ပတ်ရမယ် သို့သော် looping က
 	dataTypes တူမှပတ်လို့ရလို့ java မှာ class တွေကို dataTypes အနေနဲ့လည်း သုံးလို့ရလို့
 	polymorphism ကိုသုံးပြီး dataTypes တူအောင်အရင်လုပ်ပြီးမှ looping ပတ်လို့ရမယ်  
 	Polymorphism ဆိုတာကတော့ Inheritance Class ရှိတဲ့ class တွေမှာပဲသုံးလို့ရတယ်
 	အပေါ်ဆုံးက object တွေရဲ့ရှေ့ဆုံးက dataTypes တွေကို BankAcc ဆိုပြီးအကုန်အတူတူထားလိုက်တယ်
 	အလုပ်လုပ်ရင်တော့ object တွေက သူနဲ့သက်ဆိုင်တဲ့ constructor ကိုပဲဆောက်ပြီးအလုပ်လုပ်သွားတယ်
 	ရှေ့က dataTypes ကိုပဲပြောင်းလိုက်တာကို "Up Casting Polymorphism" လို့ခေါ်တယ်
 	ပြီးမှ အောက်ကအတိုင်း BankAcc တွေအကုန်လုံးကို looping ပတ်ပြီး print ထုတ်ချင်တော့ BankAcc ဆိုပြီး dataType တူသွားလို့
 	Array ထဲထည့်ပြီး အောက်ကလို forEach looping ပတ်လိုက်တယ်
 */
//		BankAcc [] accs = {acc, s_acc, sp_acc};
//		for(BankAcc acc1 : accs) {
//			System.out.println(acc1);
////			accs တွေကို loop ပတ်နေစဉ် acc1 က SavingAcc ဟုတ်လား/ဟုတ်ရင် အတိုးနှုန်းကိုပါ တစ်ခါတည်းထုတ်ကြည့်ချင်တယ်ဆိုရင် condition ထပ်စစ်ရတယ်
////			condition စစ်တဲ့အခါမှာ SavingAcc ရဲ့ constructor ကိုသုံးထားတာ ဟုတ်မဟုတ်ကို "instanceof" ဆိုတဲ့ keyword နဲ့စစ်ပေးရတယ်
//			if(acc1 instanceof SavingAcc) {
//				SavingAcc sv_acc = (SavingAcc) s_acc;
//				sv_acc.calcInterest();
//			}
//		}
		
		
//		Object တစ်ခုဆောက်လိုက်တာနဲ့ account number ကို မထပ်အောင် random ခေါက်ခြင်း
		BankAcc [] accs = {acc, s_acc, sp_acc};
		BankAcc.generate_Account_No(accs);
//		Random ခေါက်ပြီးရင် result ကို looping ပတ်ပြီး ပြန်ထုတ်မယ်
		for(BankAcc acc1 : accs) System.out.println(acc1);
		
		
	}

}
