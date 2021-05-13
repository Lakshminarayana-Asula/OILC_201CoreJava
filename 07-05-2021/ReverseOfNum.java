import java.util.*;
public class ReverseOfNum {
	
	static String reverse(int num) {
		String output = "";
		int x = num, r ,sum = 0;
	
		while(num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		output += sum;
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		System.out.println(reverse(num));
		
	}
}

