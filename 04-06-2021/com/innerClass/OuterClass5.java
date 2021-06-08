package com.innerClass;
interface ConcreteMethods{
	void m1();
	
	default void m2() {
		System.out.println("Welcome");
	}
	
	static void m3() {
		System.out.println("Hi.....");
	}
}
public class OuterClass5 {

	public static void main(String[] args) {
		ConcreteMethods cm = new ConcreteMethods() {
			public void m1() {
				System.out.println("Hellooo");
			}
		};
		cm.m1();
		cm.m2();
	//	cm.m3(); // Error
		ConcreteMethods.m3();

	}

}
