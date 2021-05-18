import java.util.*;
public class OddPalindrome {
	static String getOddPalindromeList(int startNum, int endNum) {
		String s = "";
		
		for(int i = startNum;i <= endNum;i++) {
			int q = i / 100;
			int r = i % 10;
			
			if(q == r) {	
				if(i % 2 != 0)
					if(s.length() == 0)
						s = s + i ;
					else
						s = s + "," + i;
			}
		}
		
		return s;
	}
	
	static boolean check(int start, int end) {
		
		if((start < 100) || (end > 999) || (start > end)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(check(num1, num2)) {
			System.out.println("Error");
		}
		else {
			System.out.println(getOddPalindromeList(num1, num2));
		}
	}
		
}
