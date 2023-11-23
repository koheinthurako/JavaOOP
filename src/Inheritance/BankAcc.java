package Inheritance;

import java.util.Random;

public class BankAcc {

	private String name;
	private int acc_no;
//	protected သည် child class တွေမှာပဲ ဒီတန်ဖိုးကို ယူသုံးခွင့်ပေးလိုက်ခြင်းဖြစ်သည်
	protected double amount;

	public BankAcc(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

//	deposit and withdraw သည် SavingAcc & SpecialAcc နှစ်ခုစလုံးနှင့်သက်ဆိုင်လို့ Parent Class ထဲမှာပဲရေးတယ် 
	public void withdraw(int withdraw_amount) {
		if(withdraw_amount > amount) {
			System.out.println("Insufficient Balance! Your total amount is : " + amount);
		} else {
			amount -= withdraw_amount;
		}
		
	}

	public void deposit(int add_amount) {
		amount += add_amount;
	}
	
//	Object တစ်ခုဆောက်လိုက်တာနဲ့ account number ကို မထပ်အောင် random ခေါက်ခြင်း ဒီနေရာကိုသတိထားကြည့်ပါ!!!
	public static void generate_Account_No(BankAcc [] accs) {
		Random r = new Random();
//		အရင်ဆုံး accs တွေထဲက acc_no မှာ random ခေါက်လိုက်တဲ့ no က ပါလားမပါလားအရင်စစ်ရမယ် အဲ့ဒါအတွက် အောက်မှာ method အသစ်ထပ်ခွဲလိုက်တယ်
		for(int i = 0; i < accs.length; i++) {
			while(accs[i].acc_no == 0) {
				int temp_no = r.nextInt(5)+1;
				if(!isContain(accs, temp_no)) accs[i].acc_no = temp_no;
			}
		}
	}
	
//	အပေါ်က random ခေါက်လိုက်တဲ့ temp_no နဲ့ accs တွေထဲမှာရှိတဲ့ acc_no နဲ့ ထပ်မထပ်ကို စစ်ခြင်း
	public static boolean isContain(BankAcc [] accs, int temp_no) {
		for(int i = 0; i < accs.length; i++) {
			if(accs[i].acc_no == temp_no) return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return acc_no + " " + name + " " + amount;
	}

}
