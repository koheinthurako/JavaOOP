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
		int area = width.convertInches() * height.convertInches();
		Length len = new Length();
		System.out.println("Area = " + len.convertLength(area));
//		ဒီနေရာမှာ Length.java ထဲက converLength() က return ပြန်လိုက်တော့ printLn(l) ဆိုပြီးဖြစ်သွားတယ် print ထုတ်မယ်ဆိုတော့ l က
//		Length object ကြီးဖြစ်နေလို့ Length class ထဲက toString() method ထဲမှာ l ထဲက ပါလာတဲ့ int နှစ်ခုက ဝင်သွားပြီး print ထုတ်သွားတယ်
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
}
