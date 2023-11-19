package Inheritence;

public class Shape {
	
	private int width;
	private int height;
	private int radius;
	
	public static void main(String[] args) {
		
		
		
	}

	public Shape(int width, int height, int radius) {
		super();
		this.width = width;
		this.height = height;
		this.radius = radius;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + ", radius=" + radius + "]";
	}
	
}
