package com.innerClass;
public class OuterDemo {
	int a = 10;
	
	OuterDemo(){
		System.out.println("a : " + a);
	}
	
	class InnerDemo{
		int b = 20;
		
		InnerDemo(){
			System.out.println("a: " + a + " b: " + b);
		}
		
	}
	
	public static void main(String[] args) {
		OuterDemo od = new OuterDemo();
		OuterDemo.InnerDemo oi = od.new InnerDemo();

	}

}
