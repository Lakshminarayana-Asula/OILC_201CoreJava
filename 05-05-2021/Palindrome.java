import java.util.*;
public class Palindrome {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any number");

		 System.out.println(isPalindrome(sc.nextInt()));
	    }

	    public static int isPalindrome(int num) {
	         int result = 0;
	         int quo = num / 100;
	         
	         if(num <= 0) {
	        	 result = -1;
	         }
	         else if(quo == 0 || quo >= 10) {
	        	 result = -2;
	         }
	         else if ((num / 100) == (num % 10)) {
	        	 result = 1;
	         }
	         else {
	        	 result = 0;
	         }
	         
	         return result;
	    }
}
