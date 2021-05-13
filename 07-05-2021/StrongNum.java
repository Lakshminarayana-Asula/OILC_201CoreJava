import java.util.*;
public class StrongNum {
	
	static String strong(int num) {
		String output = "";
		int sum = 0, rem, temp = num;
		
		while(num > 0) {
			rem = num % 10;
			sum= sum + fact(rem);
			num = num / 10;
		}
		
		if(sum == temp) {
			output += "given number is Strong";
		}
		else {
			output += "given number is not Strong";
		}
		
		return output;
	}
	
	static int fact(int num) {
		for(int i = num - 1;i >= 1;i-- ) {
			num = num * i;
		}
		
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		
		System.out.println(strong(num));
	}

}
