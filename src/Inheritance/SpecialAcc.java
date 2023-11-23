package Inheritance;

public class SpecialAcc extends BankAcc {

	private int cheque;

	public SpecialAcc(String name, double amount) {
		super(name, amount);
	}

	@Override
	public String toString() {
		return super.toString() + " (cheque cheque - " + cheque + ")";
	}

}
