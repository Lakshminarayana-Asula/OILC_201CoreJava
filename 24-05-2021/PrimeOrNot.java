import java.util.*;
public class PrimeOrNot {

	static boolean isPrime(int num) {
		boolean b = true;
	
		for(int i = 2;i < num;i++) {
			if(num % i == 0) {
				b = false;
				break;
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		
		if(isPrime(sc.nextInt())) {
			System.out.println("Given Number is a Prime");
		}
		else {
			System.out.println("Gven Number is Not a Prime");
		}
	}

}
