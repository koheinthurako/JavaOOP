package Interface;

//	Interface သုံးပုံသုံးနည်းဘာကြောင့်သုံးလဲအသေးစိတ်ဒီမှာစမယ်

class Person implements MakingSound {
	public void speak() {
		System.out.println("Hello");
	}

	@Override
	public void makeSound() {
		speak();
	}

}

class Dog implements MakingSound {
	public void bark() {
		System.out.println("Wof Wof");
	}

	@Override
	public void makeSound() {
		bark();
	}
}

class Cat implements MakingSound {
	public void crow() {
		System.out.println("Meow Meow");
	}

	@Override
	public void makeSound() {
		crow();
	}
}

public class MakeSound implements MakingSound {
	
	public static void main(String[] args) {

		MakingSound p = new Person();
		MakingSound d = new Dog();
		MakingSound c = new Cat();
		
//		p.makeSound();
		
		MakingSound [] sounds = {p, d, c};
		
		for(MakingSound sound : sounds) {
			sound.makeSound();
		}

//		p.speak();
//		d.bark();
//		c.crow();

	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

}
