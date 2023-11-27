package Interface;

public interface Shape {
	
	public static final String color = "RED";
	
	void area();
	
	public default void methodTwo() {
		System.out.println("This is method two from interface");
	}

}
