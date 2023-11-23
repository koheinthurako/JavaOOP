package Inheritance;

public class SavingAcc extends BankAcc{
	
	private boolean book;
	private static final int LIMITAMOUNT = 300;
	
/*
	Parent class ကို inheritance လုပ်လိုက်ပြီဆိုရင် parent class ထဲက constructor အတိုင်း လှမ်းခေါ်ဖို့လိုတယ်
	အဲ့လိုခေါ်ဖို့ အခု class ရဲ့ constructor ကိုဆောက်ဖို့လိုတယ် ဆောက်တဲ့အခါမှ parent class constructor က 3 arguments constructor
	ဖြစ်လို့ အခု class constructor ထဲမှာ 3 arguments ထည့်ပေးဖို့လိုတယ် parent class default constructor ဆိုရင်တော့ ထည့်ပေးဖို့မလိုဘူး
	ပြီးရင် parent class constructor ကို super method ကိုသုံးပြီးခေါ်တယ် super ထဲမှာ 3 arguments ထပ်ထည့်ပေးရတယ်
*/
	public SavingAcc(String name, double amount, boolean book) {
		super(name, amount); // ထိပ်ဆုံးမှာပဲရှိရမယ်
		this.book = book;
	}
/*
	Java မှ သတ်မှတ်ချက် 2 ရှိတယ် child class constructor ကနေ parent class constructor ကိုလှမ်းခေါ်တဲ့အခါမှာ
	parent class constructor ဖြစ်တဲ့ super က ထိပ်ဆုံးမှာပဲရှိရမယ် မရှိရင် compile time error တက်မယ်
	နောက်တစ်ခုက package "name" က code တွေအားလုံးရဲ့ အပေါ်ဆုံးမှာပဲရှိရမယ်
	SavingAcc object တစ်ခုကိုဆောက်လိုက်တာနဲ့ constructor ကအရင်အလုပ်လုပ်သွားမယ် constructor ထဲက arguments 3 ခုကတော့
	parent class နဲ့ ဆိုင်ပြီး super မှတစ်ဆင့်တန်ဖိုးတွေ BankAcc ထဲကိုရောက်သွားမယ် book argument ကတော့ ဒီ Class နဲ့ပဲလို့ this ကိုသုံးထားတယ်
*/
	
//	Method Overriding => definition တွေတူညီပြီး implementation တွေပဲကွာသွားခြင်း
	@Override
	public void withdraw(int withdraw_amount) {
		if(withdraw_amount > LIMITAMOUNT) {
			System.out.println("Withdraw amount is exceeded!");
		} else {
//			ဒီနေရာမှာ Parent class ထဲက amount ကို child class ထဲက လှမ်းယူချင်ရင် Parent class ထဲက private လို့ရေးထားတာကို
//			protected ဆိုပြီးပြောင်းပေးလိုက်တယ် အဲ့တာကို BankAcc.java ထဲမှာ သွားကြည့်ပါ ဒါဆိုအောက်ကလို getter setter သုံးနေစရာမလိုတော့ပါ
//			super.setAmount(super.getAmount() - withdraw_amount);
			super.amount -= withdraw_amount;
		}
	}
	
//	SavingAcc အတွက်သီးသန့် အတိုးတွက်ခြင်း method
	public void calcInterest() {
		System.out.println("Annula Amount with interest : " + amount + (amount*5.6/100));
	}

	@Override
	public String toString() {
		return super.toString() + " (Book : " + book + ")";
	}
	
}
