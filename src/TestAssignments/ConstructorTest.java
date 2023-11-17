package TestAssignments;

public class ConstructorTest {
	
	int x = 10;

	public static void main(String[] args) {
		
		ConstructorTest c1 = new ConstructorTest();
		System.out.println(c1.x);
		
	}
	
	public ConstructorTest() {
		x = 20;
	}

}
