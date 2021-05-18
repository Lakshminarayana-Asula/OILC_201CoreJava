import java.util.*;
public class FibbonacciSeries {

	static String getFibonacciSeries(int num) {
		String res  = "";
		int a = 0, b = 1, c = a + b;
		
		if(num == 1) {
			res += a + " ";
		}
		else{
			res += a + " ";
			res += b + " ";
		}
		
		for(int i = 3;i <= num;i++) {
			res += c + " ";
			a = b;
			b = c;
			c = a + b;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		
		System.out.println("Fibonacci Series Are :" + getFibonacciSeries(sc.nextInt()));
	}

}
