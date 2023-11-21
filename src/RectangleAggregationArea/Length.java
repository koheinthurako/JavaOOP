package RectangleAggregationArea;

public class Length {
	
	private int feet;
	private int inch;
	public static final int CONST1 = 12;
	public static final int CONST2 = 144;
	
	public Length() {
		
	}
	
	public Length(int feet, int inch) {
		this.feet = feet;
		this.inch = inch;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int convertInches() {
		return (feet * CONST1) + inch;
	}
	
	public Length convertLength(int inches) {
//		ဒီနေရာမှာ သတိထားပါ!!!!! ဒီ method က အစတုန်းက String method
//		toString() method ကနေ int နှစ်လုံးကို return ပြန်ပေးနိုင်ဖို့ Length class ကို object ဆောက်လိုက်တယ် return မှာ
//		obj ကြီးကိုသာ return ပြန်လိုက်ရင် Length class ရဲ့ toString က အလုပ်လုပ်နိုင်သွားမယ်
		
//		int f = Math.round(inches/CONST2);
//		int i = Math.round((inches%CONST2)/CONST1);
		
//		f နဲ့ i value က int တွေဖြစ်တဲ့အတွက် return မှာအဆင်ပြေအောင် l obj အနေနဲ့ တန်ဖိုးနှစ်ခုလုံးပေးလိုက်တယ် return က l object
//		ဖြစ်သွားတဲ့အတွက် method ကလည်း Length type ကိုပြောင်းသွားတာကို သတိထားရမယ် !!!
//		Length l = new Length(f, i);
		
//		အပေါ်က code တွေကို အတိုချုပ် return ပြန်မယ်ဆို ဒီလိုဖြစ်မယ်
		return new Length(Math.round(inches/CONST2), Math.round((inches%CONST2)/CONST1));
	}
	
	@Override
	public String toString() {
		return feet + "'" + inch + "\"";
	}

}
