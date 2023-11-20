package GetterSetter;

public class Square {
	
	private int width;
	private int height;
	private int radius;
	
	public Square(int width, int height, int radius) {
		this.width = width;
		this.height = height;
		this.radius = radius;
	}

//	Access Modifier - Getter/ Setter
//	Getter Setter �?ို့ကိုသုံးရ�?ြင်းသည် အသစ်ထည့်လိုက်�?ဲ့ value �?ွေကို လို�?ျင်သလို condition စစ်ပြီးမှထည့်�?ျင်လို့သုံးကြ�?ယ်
	public int getWidth() {
		return width;
	}

	// set လုပ်လိုက်�?ဲ့ value ကို condition စစ်ပြီးမှ လက်�?ံ�?ြင်း
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
