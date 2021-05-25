import java.util.*;
public class CheckEven {

	static boolean isEven(int num) {
		
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean isOdd(int num) {
		
		if(num % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		if(isEven(num)) {
			System.out.println("Given Number is Even");
		}
		else {
			System.out.println("Given Number is not an Even Number");
		}
		
	/*	if(isOdd(num)) {
			System.out.println("Given Number is Odd Number");
		}
		else {
			System.out.println("Given Number is not an Odd Number");
		} */
	}
}
