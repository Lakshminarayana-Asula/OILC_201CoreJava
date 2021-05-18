import java.util.*;
public class ListPrimes {

	static String getPrimeNumbers(int start, int end) {
		String res = "";
		boolean b;
		if(start < 0 || end < 0) {
			res += -1;
		}
		else if(start >= end) {
			res += -2;
		}
		else {
			for(int i = start;i <= end;i++) {
				b = true;
				
				for(int j = 2;j < i;j++) {
					
					if(i % j == 0) {
						b = false;
						break;
					}
					
				}
				
				if(b) {
					res += i + " ";
				}
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		System.out.println("Prime Numbers are:\n" + (getPrimeNumbers(sc.nextInt(),sc.nextInt())));
	}

}
