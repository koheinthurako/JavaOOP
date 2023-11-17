package TestAssignments;

public class ConstructorTest {
	
	int x = 10;

	public static void main(String[] args) {
		
		ConstructorTest c1 = new ConstructorTest();
		System.out.println(c1.x);
		
		ConstructorTest c2 = new ConstructorTest(30);
		System.out.println(c2.x);
		
	}
	
	public ConstructorTest() {
		x = 20;
	}
	
	public ConstructorTest(int x) {
		this.x = x;
	}

}
