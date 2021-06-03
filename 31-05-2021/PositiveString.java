import java.util.*;
public class PositiveString {

	static boolean isPositiveString(String str) {
		boolean res = true;
		str = str.toUpperCase();
		char ascii1 = str.charAt(0);
		
		for(int i = 1; i < str.length(); i++) {
			char ascii2 = str.charAt(i);
			
			if(ascii1 > ascii2) {
				res = false;
				break;
			}
			ascii1 = ascii2;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		
		System.out.println(isPositiveString(str));

	}

}
