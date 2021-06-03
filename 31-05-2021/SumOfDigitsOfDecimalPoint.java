import java.util.*;
public class SumOfDigitsOfDecimalPoint {

	static String concateSumOfDigits(double num) {
		String res = "";
		int leftPart = (int)num;
		String str = String.valueOf(num);
		String right = "";
		int flag = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == '.') {
				for(int j = i + 1; j < str.length(); j++) {
					right += str.charAt(j);
				}
			}
		}
		
		int rightPart = Integer.parseInt(right);
		if(flag < rightPart) {
			res += sumOfDigits(leftPart) + ":" + sumOfDigits(rightPart);
		}
		else {
			res += sumOfDigits(leftPart);
		}
		
		return res;
	}
	
	static int sumOfDigits(int num) {
		int sum = 0;
		
		while(num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		
		System.out.println("Output: \n" + concateSumOfDigits(sc.nextDouble()));

	}

}
