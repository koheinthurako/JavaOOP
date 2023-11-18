package OOP;

public class DepartmentTest {

	public static void main(String[] args) {
		
		Department dp1 = new Department(20, "Thet Zaw Hein", true);
		
		System.out.println(dp1.getA());
		System.out.println(dp1.getName());
		dp1.setA(25);
		System.out.println(dp1.getA());
		System.out.println(dp1);
		
	}
	
}
