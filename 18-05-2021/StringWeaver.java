import java.util.*;
public class StringWeaver {
 
	static String getWeavedString(String str1, String str2) {
		String result = "";
		
		if(str1.length() > str2.length()) {
			result += str2 + str1 + str2;
		}
		else if(str1.length() < str2.length()) {
			result += str1 + str2 + str1;
		}
		else {
			for(int i = 0;i < str1.length();i++) {
				result += str1.charAt(i) + "" + str2.charAt(i);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two strings");
		
		System.out.println("Output is: \n" + getWeavedString(sc.nextLine(), sc.nextLine()));

	}

}
