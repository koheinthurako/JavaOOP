package Interface;

//	Interface သုံးပုံသုံးနည်းဘာကြောင့်သုံးလဲအသေးစိတ်ဒီမှာစမယ်
//	လူ၊ ခွေး၊ ကြောင် အကုန်လုံး အသံထွက်နိုင်တယ် အကုန်လုံး အသံထွက်နိုင်တယ်ဆိုတဲ့ ဘုံ concept ရှိမယ်
//	အသံထွက်ဖို့ function ရှိရမယ် ထွက်တဲ့အသံတွေကလည်း ကွဲပြားသွားကြမယ် သို့သော် ဘုံအနေနဲ့ကတော့ အကုန်လုံး အသံထွက်ကြတယ်
//	ဒါကြောင့် အောက်မှာ function တွေရှိကြတယ် သူတို့ကို ပုံမှန်အတိုင်း object ဆောက်ပြီးခေါ်လို့ရတယ်
//	သို့သော် အဲ့လိုခေါ်မယ်ဆိုရင် main() ထဲမှာရေးထားသလို p.speak(), etc... အခု ၁၀၀ ရှိရင် ၁၀၀ လုံးလိုက်ရေးနေရမယ်
//	အဲ့လိုမရေးရင် loop ပတ်ထုတ်ရမယ် loop ပတ်ထုတ်ဖို့က DataTypes တွေတူဖို့လိုတယ် အဲ့လိုတူဖို့ interface class တစ်ခုခြားခံလိုက်ပြီး polyMorphism သဘောတရားနဲ့ dataTypes တူအောင်လုပ်တယ်
//	interface ထဲက makeSound method က abstract method မို့ implements လုပ်ထားတဲ့ child class တွေမှာ override ပြန်လုပ်ပြီး အဲ့ထဲမှာ မူရင်း function ကိုပြန်ခေါ်ပေးရတယ်ိ
//	ပြီးသွားရင်တော့ Array ထဲထည့်ပြီး loop ပတ်လိုက်တယ်

class Person implements MakingSound {
	public void speak() {
		System.out.println(this.getClass().getSimpleName() + " : Hello");
	}

	@Override
	public void makeSound() {
		speak();
	}

}

class Dog implements MakingSound {
	public void bark() {
		System.out.println(this.getClass().getSimpleName() + " : Wof Wof");
	}

	@Override
	public void makeSound() {
		bark();
	}
}

class Cat implements MakingSound {
	public void crow() {
		System.out.println(this.getClass().getSimpleName() + " : Meow Meow");
	}

	@Override
	public void makeSound() {
		crow();
	}
}

public class MakeSound {

	public static void main(String[] args) {

//		Up Casting PolyMorphism
		MakingSound p = new Person();
		MakingSound d = new Dog();
		MakingSound c = new Cat();

//		p.speak();
//		d.bark();
//		c.crow();

//		p.makeSound();
		MakingSound[] sounds = { p, d, c };

		for (MakingSound sound : sounds) {
			sound.makeSound();
		}

	}
}
