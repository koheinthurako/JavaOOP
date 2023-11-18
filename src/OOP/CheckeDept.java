package OOP;

public class CheckeDept {
	
	private int plusAge = 5;
	
	Department dp = new Department(3, "Ko Hein", false);
//	Department dp = new Department(plusAge);
	
	public int getPlusAge() {
		return plusAge;
	}

	public void setPlusAge(int plusAge) {
		this.plusAge = plusAge;
	}
	
	
	@Override
	public String toString() {
		return "CheckeDept [plusAge=" + plusAge + ", dp=" + dp + "]";
	}
	
}
