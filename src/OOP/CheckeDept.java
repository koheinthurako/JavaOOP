package OOP;

public class CheckeDept {
	
	private int plusAge = 5;
	
	Department dp = new Department(20, "Ko Hein", false);
	
	public int getPlusAge() {
		return plusAge;
	}

	public void setPlusAge(int plusAge) {
		this.plusAge = plusAge;
	}
	
	
	@Override
	public String toString() {
		return "Passed result from " + "[" + dp + "]";
	}
	
}
