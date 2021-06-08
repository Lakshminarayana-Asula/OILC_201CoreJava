package com.innerClass;
interface Operation{
	void sum(int a, int b);
	//void sub();
}

public class OuterClass4 {

	public static void main(String[] args) {
	Operation op = new Operation() {
			public void sum(int a , int b) {
				System.out.println("Sum : " + (a + b));
			}
		};
		
		op.sum(10, 20);

	}

}
