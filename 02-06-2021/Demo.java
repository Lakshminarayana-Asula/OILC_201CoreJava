
public class Demo {

	void sum() {
		System.out.println("Welcome");
	}
	void sum(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}
	double sum(double a, double b, double c) {
		return (a + b + c);
	}
	String sum(String name1) {
		return "Hello " + name1;
	}
	String sum(String name1, String name2) {
		return name1 + name2;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		
		d.sum();
		d.sum(10, 20);
		System.out.println("sum double : " + d.sum(10.3, 18.4, 10.2));
		System.out.println(d.sum("lachi"));
	}

}
