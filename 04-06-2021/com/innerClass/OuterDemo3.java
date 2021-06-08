package com.innerClass;

public class OuterDemo3 {
	
	void desp() {
		System.out.println("Outer Welcome");
		
		class InnerDemo{
			
			void wish() {
				System.out.println("Inner Welcome");
			}
		}
		
		InnerDemo id = new InnerDemo();
		id.wish();
	}
	
	public static void main(String[] args) {
		OuterDemo3 ot = new OuterDemo3();
		ot.desp();
	}

}
