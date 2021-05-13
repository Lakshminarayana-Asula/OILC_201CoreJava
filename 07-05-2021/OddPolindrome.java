import java.util.*;
public class OddPolindrome {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		
		if((startNum < 100) || (endNum > 999) || (startNum > endNum)) {
			System.out.println("Error");
		}
		else
			System.out.println(getOddPalindromeList(startNum, endNum));
	}
}
