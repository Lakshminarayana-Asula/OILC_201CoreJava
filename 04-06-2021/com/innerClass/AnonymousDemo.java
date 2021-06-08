package com.innerClass;
class Food{
	void eat() {
		System.out.println("Eatind Normal food");
	}
}

public class AnonymousDemo {
	Food f= new Food() {
		void eat() {
			super.eat();
			System.out.println("Eating popCorn");
		}
	};
	
	void desp() {
		f.eat();
	}
	
	public static void main(String[] args) {
		AnonymousDemo ad = new AnonymousDemo();
		ad.desp();
		ad.f.eat();
		

	}

}
