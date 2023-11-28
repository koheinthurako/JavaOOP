package Inheritance;
import RectangleAggregationArea.Length;

public class ShapeTest {

	public static void main(String[] args) {

//		Shape obj1 = new Shape("White");
		Shape obj2 = new Child_CIrcle("Red",  new Length(2,3));
		Shape obj3 = new Square("Black", new Length(3,5));
		
//		Shape [] objs = {obj1, obj2, obj3};
		Shape [] objs = {obj2, obj3};
		
/*
	ဒီနေရာမှာ Abstract အကြောင်းစမယ်!!!
	အပေါ်မှာ polymorphism နည်းကိုသုံးပြီး "Shape" DataTypes အတူတူတွေအဖြစ် objects တွေဆောက်ထားကြတယ်
	အောက်မှာကတော့ အဲ့ဒီ့ objects တွေကို loop ပတ်ပြီး area() method ကို ခေါ်ထားတယ် သို့သော် circle & square က
	area တွက်တဲ့ implementation တွေကမတူညီကြဘူး အဲ့တော့ Shape ထဲကနေ area() method အလွတ်ကြီးကိုလှမ်းခေါ်တာက အဓိပ္ပာယ်မရှိဘူး
	circle area() method က circle ထဲမှာပဲရှိရမယ် အဲ့တော့ Shape ထဲက area() method ကို ဖျက်လိုက်ပြန်ရင်လည်း child တွေကနေ
	method ခေါ်လို့မရတော့ဘူး ဒါကြောင့် Shape class ထဲမှာ implementation တွေမပါတဲ့ area method တစ်ခုကို ဘုံ method အနေနဲ့
	တည်ဆောက်ပေးဖို့လိုတယ် ဒါမှ child class တွေက area() တွက်လို့ရမယ် အဲ့လို implementation တွေမပါဘဲ အဖြစ်သဘောတစ်ခုအနေနဲ့
	ရေးပေးချင်ရင် "Abstract" နည်းလမ်းကို သုံးရတယ် အဲ့ဒါကို Shape class ထဲမှာရေးထားတယ် ကြည့်ပါ
	အဲ့ဘက်မှာ abstract အကြောင်းကိုကြည့်ပြီးရင် ဒီဘက်မှာ ထိပ်ဆုံးက abstract Shape class ကို object ဆောက်တဲ့အခါ error တက်နေလိမ့်မယ်
	ဘာလို့လဲဆိုတော့ "Abstract Class တွေကို Constructor ကိုသုံးပြီး Object ဆောက်လို့မရပါ"
 */
		
		for(Shape obj : objs) {
			obj.area();
		}
		
	}

}
