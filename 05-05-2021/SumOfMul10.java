import java.util.*;
public class SumOfMul10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers");
		
		System.out.println(sumOfMultiples(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}
	
	static int round(int num) {
		if(num % 10 != 0) {
			return ((num / 10) + 1) * 10;
		}
		else {
			return num;
		}
	}
	
	static String sumOfMultiples(int num1, int num2, int num3) {
		String result = "";
		if(num1 <= 0 || num2 <= 0 || num3 <= 0) {
			result += -1;
		}
		else {
			result += round(num1) + round(num2) + round(num3); 
		}
		
		return result;
	}
}
