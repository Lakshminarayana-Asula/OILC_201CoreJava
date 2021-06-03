import java.util.*;
public class SumOfAllArmStrongNums {

	static boolean containsAllOddDigits(int num) {
		boolean b = true;
		int[] arr = getDigits(num);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 && arr[i] != 0) {
				b = false;
			}
		}
		
		return b;
	}
	
	static int[] getDigits(int num) {
		String str = Integer.toString(num);
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		
		return arr;
	}
	
	static int sumOfPowerOfDigits(int num) {
		int sum = 0;
		
		while(num > 0) {
			int rem = num % 10;
			sum += rem * rem * rem;
			num /= 10;
		}
		
		return sum;
	}
	
	static boolean isArmStrong(int num) {
		boolean b = false;
		int armCheck = sumOfPowerOfDigits(num);
		
		if(num == armCheck) {
			if(containsAllOddDigits(num)) {
				b = true;
			}
		}
		
		return b;
	}
	
	static int getSumOfAllArmStrongNumbers(int firstNum, int lastNum) {
		int sum = 0;
		
		if(firstNum > lastNum) {
			sum = -3;
		}
		else if(firstNum == 0) {
			sum = -2;
		}
		else if(firstNum < 0 || lastNum < 0) {
			sum = -3;
		}
		else {
			for(int i = firstNum; i <= lastNum; i++) {
				if(isArmStrong(i)){
					System.out.println(i);
					sum += i;
				}
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range (firstNum and lastNum)");
		System.out.println("Sum Of All Odd ArmStrong Numbers are : \n" + getSumOfAllArmStrongNumbers(sc.nextInt(), sc.nextInt()));

	}

}
