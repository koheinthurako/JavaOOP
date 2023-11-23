package Inheritance;

public class SpecialAcc extends BankAcc {

	private int cheque;
	private static final int LIMITAMOUNT = 10;

	public SpecialAcc(String name, double amount) {
		super(name, amount);
	}
	
	@Override
	public void withdraw(int withdraw_amount) {
		if(withdraw_amount > super.amount - LIMITAMOUNT) {
			System.out.println("Limit Exceeded! You have to remain at least $10 in your account!");
		} else {
			super.amount -= withdraw_amount;
		}
	}
 
	@Override
	public String toString() {
		return super.toString() + " (cheque - " + cheque + ")";
	}

}
