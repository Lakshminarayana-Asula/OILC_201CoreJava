import java.util.*;
public class SwapThreeNumbers {

	static void swapWithTemporary(int num1, int num2, int num3) {
		int temp = num3;
		num3 = num2;
		num2 = num1;
		num1 = temp;
		
		System.out.println("After swapping with temporary variable \nnum1 = " + num1 + "\nnum2 = " + num2 + "\nnum3 = " + num3);
	}
	
	static void swapWithoutTemporary(int num1, int num2, int num3) {
		num1 = num1 + num2 + num3;
		num2 = num1 - (num2 + num3);
		num3 = num1 - (num2 + num3);
		num1 = num1 - (num2 + num3);
		
		System.out.println("After swapping without temporary variable \nnum1 = " + num1 + "\nnum2 = " + num2 + "\nnum3 = " + num3);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("Given values are \nnum1 = " + num1 + "\nnum2 = " + num2 + "\nnum3 = " + num3);
		
		swapWithoutTemporary(num1, num2, num3);
	}

}
