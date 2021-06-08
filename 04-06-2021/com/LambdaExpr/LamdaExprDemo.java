package com.LambdaExpr;

@FunctionalInterface
interface OperationDemo{
	void sum(int a, int b);
}

public class LamdaExprDemo {
	OperationDemo od = (x, y) -> {
		System.out.println("Sum: " + (x + y));
	};
			
	void disp(int x, int y) {
		od.sum(x, y);
	}
	
	public static void main(String[] args) {
		LamdaExprDemo led = new LamdaExprDemo();
	//	led.od.sum(10, 20);
		led.disp(10, 20);

	}	

}
