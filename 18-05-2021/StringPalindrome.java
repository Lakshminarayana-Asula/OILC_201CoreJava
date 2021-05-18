import java.util.*;
public class StringPalindrome {

	static String isPalindrome(String str) {
		String rev = "";
		String res = "";
		
		for(int i = str.length()-1;i >= 0;i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev)) {
			res += "Given String is a Palindrome";
		}
		else {
			res += "Given String is not a Palindrome";
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		System.out.println(isPalindrome(str));

	}

}
