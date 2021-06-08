package com.innerClass;

public class OuterDemo2 {

	static class InnerDemo {
		static void desp() {
			System.out.println("Welcome");
		}
	}
	
	public static void main(String[] args) {
	//	OuterDemo2 ot = new OuterDemo2();
		OuterDemo2.InnerDemo.desp();

	}

}
