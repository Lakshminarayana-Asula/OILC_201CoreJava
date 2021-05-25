import java.util.*;
public class PrimeNumbersUpto100 {

	static String getPrimeNumbers() {
		String output = "";
		boolean b;
		
		for(int i = 1; i <= 100; i++) {
			b = true;
			
			for(int j = 2; j < i; j++) {
				
				if(i % j == 0) {
					b = false;
					break;
				}
			}
			if(b) {
				output += i + "\n";
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prime Numbers upto 100 are: \n" + getPrimeNumbers());
	}

}
