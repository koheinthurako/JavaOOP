package Inheritence;

public class Square {
	
	private int width;
	private int height;
	private int radius;
	
	public Square(int width, int height, int radius) {
		this.width = width;
		this.height = height;
		this.radius = radius;
	}

	// Access Modifier - Getter/ Setter
	public int getWidth() {
		return width;
	}

	// set လုပ်လိုက်တဲ့ value ကို condition စစ်ပြီးမှ လက်ခံခြင်း
	public void setWidth(int width) {
		if(width > 0 & width<100)
		this.width = width;
		else this.width = 1;
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
