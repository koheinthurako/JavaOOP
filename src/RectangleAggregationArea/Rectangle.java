package RectangleAggregationArea;

public class Rectangle {

	private Length width;
	private Length height;
	private String color;
	
	public Rectangle(Length width, Length height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Length getWidth() {
		return width;
	}

	public void setWidth(Length width) {
		this.width = width;
	}

	public Length getHeight() {
		return height;
	}

	public void setHeight(Length height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void calcArea() {
//		System.out.println("Area = " + width.convertInches() * height.convertInches());
		int area = width.convertInches() * height.convertInches();
		System.out.println(width.convertLength(area));
//		ဒီနေရာမှာ
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
}
