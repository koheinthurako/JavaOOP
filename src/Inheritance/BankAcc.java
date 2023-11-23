package Inheritance;

public class BankAcc {

	private String name;
	private int acc_no;
	private double amount;

	public BankAcc(String name, int acc_no, double amount) {
		super();
		this.name = name;
		this.acc_no = acc_no;
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

	@Override
	public String toString() {
		return "BankAcc [name=" + name + ", acc_no=" + acc_no + ", amount=" + amount + "]";
	}

}
