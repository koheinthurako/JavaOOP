package Inheritance;

public class BankAcc {

	private String name;
	private int acc_no;
	private double amount;

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
	public void withdraw() {
		
	}
	
	public void deposit(int add_amount) {
		amount += add_amount;
	}
	
	@Override
	public String toString() {
		return name + " " + amount;
	}

}
