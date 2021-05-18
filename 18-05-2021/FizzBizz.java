import java.util.*;
public class FizzBizz {
	
	static String getOutputString(int num) {
		String res = "";
		
		if(num % 3 == 0 && num % 5 == 0) {
			res = "FizzBizz";
		}
		else if(num % 3 == 0) {
			res = "Fizz";
		}
		else if(num % 5 == 0) {
			res = "Bizz";
		}
		else {
			res += num;
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("Error");
			System.exit(0);
		}
		else {
			System.out.println(getOutputString(num));
		}	
	}
}
