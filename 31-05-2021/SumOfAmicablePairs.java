import java.util.*;
public class SumOfAmicablePairs {
	
	static int sumOfAmicablePairs(int num) {
		int pair = 0;
		int first = getSumOfProperDivisors(num);
		int second = getSumOfProperDivisors(first);
		
		if(second  == num) {
			pair = first;
		}
		
		return pair;
	}
	
	static int getSumOfProperDivisors(int num) {
		int sum = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
	
		System.out.println(sumOfAmicablePairs(num));
		
	}

}
