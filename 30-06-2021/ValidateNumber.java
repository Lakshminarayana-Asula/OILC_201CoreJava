import java.util.*;
public class ValidateNumber {

	static String validate(long num) {
		String res = "Not Validated";
		String str = String.valueOf(num);
		int len = str.length();
		
		if(len == 10) {
			res = "Validated";
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		long num = sc.nextLong();
		System.out.println(validate(num));
	}

}
