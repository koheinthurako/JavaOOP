package Interface;

public class Circle implements Shape {

	@Override
	public void area() {
		System.out.println("This is area");
	}
	
	@Override
	public void methodTwo() {
		System.out.println("This is methodTwo from circle");
	}
	

}
